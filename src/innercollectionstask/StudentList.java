package innercollectionstask;

	import java.util.ArrayList;

	public class StudentList {
	    public static void main(String[] args) {
	        ArrayList<String> students = new ArrayList<>();

	        students.add("Arun");
	        students.add("Priya");
	        students.add("Karthik");
	        students.add("Divya");
	        students.add("Suresh");

	        System.out.println("Student Names:");
	        for (int i = 0; i < students.size(); i++) {
	            System.out.println(students.get(i));
	        }
	    }
	}


