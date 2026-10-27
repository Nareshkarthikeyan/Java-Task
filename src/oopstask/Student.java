package oopstask;

		public class Student {
		    String name;
		    int rollNo;
		    int mark;

		    public Student(String name, int rollNo, int mark) {
		        this.name = name;
		        this.rollNo = rollNo;
		        this.mark = mark;
		    }

		    public void display() {
		        System.out.println("Name: " + name + " | RollNo: " + rollNo + " | Mark: " + mark);
		    }

		    public static void main(String[] args) {
		        Student s1 = new Student("Vishnu", 101, 85);
		        Student s2 = new Student("Arun", 102, 90);
		        s1.display();
		        s2.display();
		    }
		}

	


