package oopstask;

		public class Developer extends Employee {
		    String programmingLanguage;

		    public Developer(String name, int id, double salary, String programmingLanguage) {
		        super(name, id, salary);
		        this.programmingLanguage = programmingLanguage;
		    }

		    public void display() {
		        System.out.println("Name: " + name);
		        System.out.println("ID: " + id);
		        System.out.println("Salary: " + salary);
		        System.out.println("Programming Language: " + programmingLanguage);
		    }

		    public static void main(String[] args) {
		        Developer dev = new Developer("Vishnu", 101, 60000, "Java");
		        dev.display();
		    }
		}

