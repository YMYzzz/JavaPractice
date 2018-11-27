
import java.util.*;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated.getTime();
	}
	
	Account(int newId,double newBalance) {
		this.id = newId;
		this.balance = newBalance;
		dateCreated.getTime();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		this.annualInterestRate = newAnnualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return balance*this.annualInterestRate/1200;
	}
	
	public void withDraw(double count) {
		this.balance -= count;
		System.out.println("You got $" + count);
		System.out.println("Balance of Your Account Was $" + this.balance);
	}
	
	public void deposit(double found) {
		this.balance += found;
		System.out.println("You save $" + found);
		System.out.println("Balance of Your Account Was $" + this.balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input ID Balance Rate");
		Scanner input = new Scanner(System.in);
		int id;
		double balance;
		double rate;
		double take;
		double in;
		
		id = input.nextInt();
		balance = input.nextDouble();
		rate = input.nextDouble();
		Account ac = new Account (id,balance);
		ac.setAnnualInterestRate(rate);
		
		System.out.println(ac.getId());	
		System.out.println(ac.getBalance());
		System.out.println(ac.getMonthlyInterestRate());	
		System.out.println(ac.dateCreated);
		
		System.out.println("Please input Taking Money");
		take = input.nextDouble();
		ac.withDraw(take);
		System.out.println("Please input Saving Money");
		in = input.nextDouble();
		ac.deposit(in);
		
		ac.getId();
		ac.getBalance();
		ac.getMonthlyInterestRate();
		System.out.println(ac.dateCreated);

	}

}
