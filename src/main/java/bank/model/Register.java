package bank.model;

public class Register {

	private int regNo;
	private String custName;
	private String userName;
	private String password;
	private float accBalance;
	public Register(int regNo, String custName, String userName, String password, float accBalance) {
		super();
		this.regNo = regNo;
		this.custName = custName;
		this.userName = userName;
		this.password = password;
		this.accBalance = accBalance;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	
	
}
