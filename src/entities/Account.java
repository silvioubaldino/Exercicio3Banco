package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account(int countId, String name) {
		this.number = countId;
		this.holder = name;
	}

	public Account(int accountId, String name, double initialDeposit) {
		this.number = accountId;
		this.holder = name;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
