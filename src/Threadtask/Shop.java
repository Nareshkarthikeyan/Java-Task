package Threadtask;

public class Shop {
	

	    boolean productAvailable = false;

	    // Consumer - product illana wait()
	    synchronized void consume(String name) throws InterruptedException {
	        System.out.println(name + " vandhaanga, product irukka nu paakraanga...");
	        while (!productAvailable) {
	            System.out.println(name + " waiting...");
	            wait();
	        }
	        System.out.println(name + " product consume pannitaanga!");
	        productAvailable = false;
	    }

	    // Producer - product produce panni notifyAll()
	    synchronized void produce() {
	        System.out.println("Producer: Product produce panren...");
	        try { Thread.sleep(2000); } catch (Exception e) {}
	        productAvailable = true;
	        System.out.println("Producer: Product ready! notifyAll() panren!");
	        notifyAll(); // Ella consumers kum signal
	    }

	    // Single consumer ku mattum - notify() example
	    synchronized void produceOne() {
	        productAvailable = true;
	        System.out.println("Producer: One product ready! notify() panren!");
	        notify();
	    }
	
	    public static void main(String[] args) {
	        Shop shop = new Shop();

	        Thread c1 = new Thread(() -> { try { shop.consume("Consumer-1"); } catch (Exception e) {} });
	        Thread c2 = new Thread(() -> { try { shop.consume("Consumer-2"); } catch (Exception e) {} });
	        Thread c3 = new Thread(() -> { try { shop.consume("Consumer-3"); } catch (Exception e) {} });
	        Thread producer = new Thread(() -> shop.produce());

	        c1.start(); c2.start(); c3.start();
	        try { Thread.sleep(500); } catch (Exception e) {}
	        producer.start();
	    }
	}

