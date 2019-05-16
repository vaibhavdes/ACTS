package pojos;

import javax.persistence.*;

@Entity
@Table(name="bank_account")
public class BankAccount {
	private Integer bank_id;
	private String bank_name;
	private Integer bank_account;
	private Vendor vendorIdentity;

	public BankAccount() {
		System.out.println("in constr of "+getClass().getName());
	}

	public BankAccount(String bank_name, Integer bank_account) {
		super();
		this.bank_name = bank_name;
		this.bank_account = bank_account;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bid")
	public Integer getBank_id() {
		return bank_id;
	}

	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}
	@Column(length=20)
	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	@Column(length=20,unique=true)
	public Integer getBank_account() {
		return bank_account;
	}

	public void setBank_account(Integer bank_account) {
		this.bank_account = bank_account;
	}
	
	@ManyToOne		//Different Bank Accounts to One Person
	@JoinColumn(name="vendorId")
	public Vendor getVendorIdentity() {
		return vendorIdentity;
	}

	public void setVendorIdentity(Vendor vendorIdentity) {
		this.vendorIdentity = vendorIdentity;
	}
	
	
}
