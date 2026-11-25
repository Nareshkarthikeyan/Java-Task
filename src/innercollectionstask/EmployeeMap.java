package innercollectionstask;

import java.util.HashMap;

public class EmployeeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Arun");
        employees.put(102, "Priya");
        employees.put(103, "Karthik");
        employees.put(104, "Divya");
        employees.put(105, "Suresh");

        System.out.println("Employee Details:");
        // Key-Value pair ah print panra method
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + " - Name: " + employees.get(id));
        }
    }
}

