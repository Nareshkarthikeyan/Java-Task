package Threadtask;
	
	class Food {
	    boolean isReady = false;

	    synchronized void waitForFood() throws InterruptedException {
	        System.out.println("Customer: Food ready ah? Waiting...");
	        while (!isReady) {
	            wait(); 
	        }
	        System.out.println("Customer: Food vandhuchu! Eating now...");
	    }

	    synchronized void prepareFood() {
	        System.out.println("Chef: Food prepare panren...");
	        try { Thread.sleep(2000); } catch (Exception e) {}
	        isReady = true;
	        System.out.println("Chef: Food ready! notify() panren...");
	        notify(); 
	    }
	
	    public static void main(String[] args) {
	        Food food = new Food();

	        Thread customer = new Thread(() -> {
	            try { food.waitForFood(); } catch (Exception e) {}
	        });

	        Thread chef = new Thread(() -> food.prepareFood());

	        customer.start();
	        try { Thread.sleep(500); } catch (Exception e) {}
	        chef.start();
	    }
	}


