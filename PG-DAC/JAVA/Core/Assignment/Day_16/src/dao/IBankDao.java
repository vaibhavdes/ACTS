package dao;

import java.util.List;

import pojos.Bank;

public interface IBankDao {
	List<Bank> getBankAccountDetails(String type) throws Exception;
	List<Bank> getSummary() throws Exception;

	//
	String addAccount(Bank b) throws Exception; 
			
}
