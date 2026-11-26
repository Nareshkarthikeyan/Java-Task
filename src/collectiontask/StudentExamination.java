package collectiontask;

import java.util.*;

public class StudentExamination {
    public static void main(String[] args) {
        // 1. ArrayList - All registered students
        ArrayList<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Priya");
        students.add("Karthik");
        System.out.println("ArrayList - Students: " + students);

        // 2. Deque - Waiting for exam registration
        Deque<String> examQueue = new ArrayDeque<>();
        examQueue.addLast("Arun");
        examQueue.addLast("Priya");
        examQueue.addFirst("Karthik - Late Entry");
        System.out.println("Deque - Exam Queue: " + examQueue);

        // 3. HashMap - Student ID and Marks
        HashMap<Integer, Integer> marks = new HashMap<>();
        marks.put(101, 85);
        marks.put(102, 95);
        marks.put(103, 75);
        System.out.println("HashMap - ID & Marks: " + marks);

        // 4. PriorityQueue - Highest marks first (Reverse Order)
        PriorityQueue<Integer> topMarks = new PriorityQueue<>(Collections.reverseOrder());
        topMarks.addAll(marks.values());
        System.out.println("PriorityQueue - Top Mark: " + topMarks.poll());

        // 5. HashSet - Unique email IDs
        HashSet<String> emails = new HashSet<>();
        emails.add("arun@gmail.com");
        emails.add("priya@gmail.com");
        emails.add("arun@gmail.com"); // Duplicate
        System.out.println("HashSet - Unique Emails: " + emails);

        // 6. Stack - Recent entered records
        Stack<String> recent = new Stack<>();
        recent.push("Arun - 101");
        recent.push("Priya - 102");
        System.out.println("Stack - Recent Record: " + recent.peek());

        // 7. TreeSet - Roll numbers sorted
        TreeSet<Integer> rollNos = new TreeSet<>();
        rollNos.add(103);
        rollNos.add(101);
        rollNos.add(102);
        System.out.println("TreeSet - Sorted Roll Nos: " + rollNos);

        // 8. TreeMap - Student details sorted by roll no
        TreeMap<Integer, String> studentDetails = new TreeMap<>();
        studentDetails.put(103, "Karthik - 75 Marks");
        studentDetails.put(101, "Arun - 85 Marks");
        studentDetails.put(102, "Priya - 95 Marks");
        System.out.println("TreeMap - Sorted Details: " + studentDetails);
 
	}

}
