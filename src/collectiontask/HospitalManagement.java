package collectiontask;

		import java.util.*;

		public class HospitalManagement {
		    public static void main(String[] args) {
		        // 1. ArrayList - Store list of patients
		        ArrayList<String> patients = new ArrayList<>();
		        patients.add("Arun");
		        patients.add("Priya");
		        patients.add("Karthik");
		        System.out.println("ArrayList - All Patients: " + patients);

		        // 2. Deque - Waiting for consultation from both ends
		        Deque<String> waitingQueue = new ArrayDeque<>();
		        waitingQueue.addFirst("Priya - Emergency"); // Munnadi
		        waitingQueue.addLast("Arun"); // Pinnaadi
		        waitingQueue.addLast("Karthik");
		        System.out.println("Deque - Waiting Queue: " + waitingQueue);
		        System.out.println("Deque - Next Patient: " + waitingQueue.removeFirst());

		        // 3. HashMap - Patient ID and Details
		        HashMap<Integer, String> patientMap = new HashMap<>();
		        patientMap.put(101, "Arun - Fever");
		        patientMap.put(102, "Priya - Fracture");
		        patientMap.put(103, "Karthik - Cold");
		        System.out.println("HashMap - ID & Details: " + patientMap);

		        // 4. PriorityQueue - Emergency patients first (1 = High Priority)
		        PriorityQueue<String> emergency = new PriorityQueue<>();
		        emergency.add("3 - Karthik - Cold");
		        emergency.add("1 - Priya - Fracture");
		        emergency.add("2 - Arun - Fever");
		        System.out.println("PriorityQueue - Emergency First: " + emergency.poll());

		        // 5. HashSet - Unique contact numbers (duplicate varadhu)
		        HashSet<String> contacts = new HashSet<>();
		        contacts.add("9876543210");
		        contacts.add("9876543210"); // Duplicate - add aagadhu
		        contacts.add("9123456780");
		        System.out.println("HashSet - Unique Contacts: " + contacts);

		        // 6. Stack - Recent visited records (LIFO)
		        Stack<String> recent = new Stack<>();
		        recent.push("Arun");
		        recent.push("Priya");
		        System.out.println("Stack - Recent Visited: " + recent);
		        System.out.println("Stack - Last Visited: " + recent.pop());

		        // 7. TreeSet - Patient IDs in sorted order
		        TreeSet<Integer> sortedIds = new TreeSet<>();
		        sortedIds.add(103);
		        sortedIds.add(101);
		        sortedIds.add(102);
		        System.out.println("TreeSet - Sorted IDs: " + sortedIds);

		        // 8. TreeMap - Patients sorted by ID
		        TreeMap<Integer, String> sortedPatients = new TreeMap<>();
		        sortedPatients.put(103, "Karthik");
		        sortedPatients.put(101, "Arun");
		        sortedPatients.put(102, "Priya");
		        System.out.println("TreeMap - Sorted Patients: " + sortedPatients);
		    }
		}
		
		

