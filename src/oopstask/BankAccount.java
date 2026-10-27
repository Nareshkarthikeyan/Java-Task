package oopstask;

		public class BankAccount {
		    private int accountNumber;
		    private double balance;

		    public BankAccount(int accountNumber, double balance) {
		        this.accountNumber = accountNumber;
		        this.balance = balance;
		    }

		    public int getAccountNumber() { return accountNumber; }
		    public double getBalance() { return balance; }

		    public void deposit(double amount) {
		        if(amount > 0) {
		            balance += amount;
		            System.out.println("Deposited: " + amount);
		        } else {
		            System.out.println("Invalid deposit amount");
		        }
		    }

		    public void withdraw(double amount) {
		        if(amount > 0 && amount <= balance) {
		            balance -= amount;
		            System.out.println("Withdrawn: " + amount);
		        } else {
		            System.out.println("Insufficient balance or invalid amount");
		        }
		    }

		    public static void main(String[] args) {
		        BankAccount acc = new BankAccount(12345, 10000);
		        System.out.println("Account: " + acc.getAccountNumber() + " Balance: " + acc.getBalance());
		        acc.deposit(1000);
		        acc.withdraw(2000);
		        System.out.println("Final Balance: " + acc.getBalance());
		    }
		}

	
