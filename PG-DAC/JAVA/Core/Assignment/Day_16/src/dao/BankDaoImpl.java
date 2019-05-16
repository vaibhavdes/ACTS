package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import static utils.Dbutils.fetchConnection;
import pojos.Bank;

public class BankDaoImpl implements IBankDao {
	private Connection cn;
	private PreparedStatement pst1, pst2,pst3;

	public BankDaoImpl() throws Exception {
		// get db cn
		cn = fetchConnection();
		// pst
		pst1 = cn.prepareStatement("select * from bank_accounts where type=? order by bal");
		
		String sql = "insert into bank_accounts values(?,?,?,?)";
		pst2 = cn.prepareStatement(sql);
		
		pst3= cn.prepareStatement("select * from bank_accounts");
		System.out.println("dao inited");
	}

	public void cleanUp() throws Exception {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();

		if (cn != null)
			cn.close();
		System.out.println("dao cleaned up");
	}

	@Override
	public List<Bank> getBankAccountDetails(String type) throws Exception {
		ArrayList<Bank> bank = new ArrayList<>();
		// set IN params
		pst1.setString(1, type);
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				bank.add(new Bank(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getDouble(4)));
		}
		return bank;
	}
	
	@Override
	public List<Bank> getSummary() throws Exception {
		ArrayList<Bank> bank = new ArrayList<>();
		// set IN params
		try (ResultSet rst = pst3.executeQuery()) {
			while (rst.next())
				bank.add(new Bank(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getDouble(4)));
		}
		return bank;
	}

	@Override
	public String addAccount(Bank b) throws Exception {
		// set IN params
		pst2.setInt(1, b.getActNo());
		pst2.setInt(2, b.getId());
		pst2.setString(3, b.getType());
		pst2.setDouble(4, b.getBal());
		// exec
		int updateCount = pst2.executeUpdate();
		if (updateCount == 1)
			return "Account added successfully....";
		return "Account adding failed...";
	}

}
