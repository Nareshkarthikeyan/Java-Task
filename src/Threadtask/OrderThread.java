package Threadtask;

	
	public class OrderThread extends Thread {
	    public void run() {
	        System.out.println("RUNNABLE: Order processing started...");
	        try {
	            System.out.println("TIMED_WAITING: Thread going to sleep for 2 seconds...");
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	        System.out.println("RUNNABLE: Order processing continued...");
	    }
	}

	 class Main {
	    public static void main(String[] args) throws InterruptedException {
	        OrderThread t = new OrderThread();

	        // NEW State - Thread created but not started
	        System.out.println("NEW: State = " + t.getState());

	        t.start(); // start() calls run()
	        System.out.println("RUNNABLE: State after start() = " + t.getState());

	        Thread.sleep(500);
	        System.out.println("TIMED_WAITING: State during sleep() = " + t.getState());

	        t.join(); // Wait till thread finishes
	        System.out.println("TERMINATED: State = " + t.getState());
	    }
	}


