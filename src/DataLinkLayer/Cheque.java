package DataLinkLayer;

public class Cheque implements Payment {
	private int id;
	private String chequeId;
	private String accountId;
	private String bankId;
	private double amount;
	
	public int getId() {
		return id;
	}
	public String getChequeId() {
		return chequeId;
	}
	public String getAccountId() {
		return accountId;
	}
	public String getBankId() {
		return bankId;
	}
	public double getAmount() {
		return amount;
	}
	
	public Cheque(String chequeId, String accountId, String bankId, double amount) {
		super();
		this.chequeId = chequeId;
		this.accountId = accountId;
		this.bankId = bankId;
		this.amount = amount;
	}
	public Cheque(int id) {
		//get
	}
	
	
}
