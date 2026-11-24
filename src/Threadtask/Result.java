package Threadtask;

public class Result {
	
	
	    boolean isPublished = false;

	    synchronized void waitForResult(String name) throws InterruptedException {
	        System.out.println(name + " waiting for result...");
	        while (!isPublished) {
	            wait();
	        }
	        System.out.println(name + " got result! PASS!");
	    }

	    synchronized void publishResult() {
	        System.out.println("Teacher: Result publish panren...");
	        try { Thread.sleep(2000); } catch (Exception e) {}
	        isPublished = true;
	        System.out.println("Teacher: notifyAll() - Ella students kum solliten!");
	        notifyAll(); // 3 perayum eluppuvan
	    }
	

	
	    public static void main(String[] args) {
	        Result r = new Result();

	        Thread s1 = new Thread(() -> { try { r.waitForResult("Student-1"); } catch (Exception e) {} });
	        Thread s2 = new Thread(() -> { try { r.waitForResult("Student-2"); } catch (Exception e) {} });
	        Thread s3 = new Thread(() -> { try { r.waitForResult("Student-3"); } catch (Exception e) {} });
	        Thread teacher = new Thread(() -> r.publishResult());

	        s1.start(); s2.start(); s3.start();
	        try { Thread.sleep(500); } catch (Exception e) {}
	        teacher.start();
	    }
	}
	


