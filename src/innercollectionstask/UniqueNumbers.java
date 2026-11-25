package innercollectionstask;


	import java.util.HashSet;

	public class UniqueNumbers {
	    public static void main(String[] args) {
	        HashSet<Integer> numbers = new HashSet<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(10); // Duplicate - idhu add aagadhu
	        numbers.add(40);
	        numbers.add(50);
	        numbers.add(20); // Duplicate
	        numbers.add(60);
	        numbers.add(70);
	        numbers.add(80);

	        System.out.println("Unique Numbers: " + numbers);
	        System.out.println("Total unique count: " + numbers.size());
	    }
	}


