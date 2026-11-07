package functional;

	@FunctionalInterface
	interface Student {
	    void display();
	}

	public class StudentFunctionalInterface {
	    public static void main(String[] args) {
	        // Implement using lambda
	        Student s = () -> {
	            String name = "Naresh";
	            int age = 22;
	            String dept = "Java";
	            System.out.println("Student Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Department: " + dept);
	        };

	        s.display();
	    }
	}
	
	


