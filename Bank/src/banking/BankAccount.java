package banking;

import java.util.ArrayList;

public class BankAccount {

	private float accBalance;
	private String accNumber;
	private String ownerId;
	private ArrayList<String> accTransactions = new ArrayList<String>();
	
	public BankAccount(float _accBalance, String _accNumber, String _ownerId) throws Exception {
		if(_accBalance >= 0) {
			this.setAccBalance(_accBalance);
		}else {
			throw new Exception("Balance < 0");
		}
		if(_accNumber.length() == 16) {
			this.setAccNumber(_accNumber);
		}else {
			throw new Exception("Incorrect Account Number");
		}
		this.setOwnerId(_ownerId);
	}

	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public ArrayList<String> getAccTransactions() {
		return accTransactions;
	}

	public void addAccTransaction(String description) {
		accTransactions.add(description);
	}
}
