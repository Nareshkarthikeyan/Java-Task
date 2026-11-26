package collectiontask;

		import java.util.*;

		public class OnlineShopping {
		    public static void main(String[] args) {
		        // 1. ArrayList - All customer orders
		        ArrayList<String> orders = new ArrayList<>();
		        orders.add("Order 1001 - Mobile");
		        orders.add("Order 1002 - Laptop");
		        orders.add("Order 1003 - Shirt");
		        System.out.println("ArrayList - All Orders: " + orders);

		        // 2. Deque - Pending orders from both ends
		        Deque<String> pending = new ArrayDeque<>();
		        pending.addFirst("Order 1002 - Urgent");
		        pending.addLast("Order 1001");
		        pending.addLast("Order 1003");
		        System.out.println("Deque - Pending Orders: " + pending);
		        System.out.println("Deque - Processing: " + pending.removeFirst());

		        // 3. HashMap - Order ID and Details
		        HashMap<Integer, String> orderDetails = new HashMap<>();
		        orderDetails.put(1001, "Mobile - Rs.15000");
		        orderDetails.put(1002, "Laptop - Rs.50000");
		        orderDetails.put(1003, "Shirt - Rs.1000");
		        System.out.println("HashMap - Order Details: " + orderDetails);

		        // 4. PriorityQueue - Process orders based on priority (1 = High)
		        PriorityQueue<String> priorityOrders = new PriorityQueue<>();
		        priorityOrders.add("2 - Order 1001");
		        priorityOrders.add("1 - Order 1002 - Express");
		        priorityOrders.add("3 - Order 1003");
		        System.out.println("PriorityQueue - First Process: " + priorityOrders.poll());

		        // 5. HashSet - Unique customer IDs
		        HashSet<Integer> customerIds = new HashSet<>();
		        customerIds.add(501);
		        customerIds.add(502);
		        customerIds.add(501); // Duplicate
		        System.out.println("HashSet - Unique Customers: " + customerIds);

		        // 6. Stack - Recent cancelled orders
		        Stack<String> cancelled = new Stack<>();
		        cancelled.push("Order 1003 - Shirt");
		        cancelled.push("Order 1001 - Mobile");
		        System.out.println("Stack - Recent Cancelled: " + cancelled.pop());

		        // 7. TreeSet - Product IDs sorted
		        TreeSet<Integer> productIds = new TreeSet<>();
		        productIds.add(3003);
		        productIds.add(3001);
		        productIds.add(3002);
		        System.out.println("TreeSet - Sorted Product IDs: " + productIds);

		        // 8. TreeMap - Order details sorted by Order ID
		        TreeMap<Integer, String> sortedOrders = new TreeMap<>();
		        sortedOrders.put(1003, "Shirt");
		        sortedOrders.put(1001, "Mobile");
		        sortedOrders.put(1002, "Laptop");
		        System.out.println("TreeMap - Sorted Orders: " + sortedOrders);
		    }
		}
		
		

	
