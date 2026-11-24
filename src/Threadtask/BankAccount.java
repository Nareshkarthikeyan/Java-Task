package Threadtask;
 
	
	class BankAccount {
	    int balance = 5000;

	    // synchronized - oru nerathula oru thread mattum ulla vara mudiyum
	    synchronized void withdraw(String name, int amount) {
	        System.out.println(name + " trying to withdraw Rs." + amount);
	        if (balance >= amount) {
	            System.out.println(name + " withdraw success!");
	            balance = balance - amount;
	            System.out.println("Remaining Balance: Rs." + balance);
	        } else {
	            System.out.println(name + " failed! Insufficient Balance: Rs." + balance);
	        }
	    }
	

	
	    public static void main(String[] args) {
	        BankAccount acc = new BankAccount();

	        Thread t1 = new Thread(() -> acc.withdraw("Thread-1", 4000));
	        Thread t2 = new Thread(() -> acc.withdraw("Thread-2", 4000));

	        t1.start();
	        t2.start();
	    }
	}


