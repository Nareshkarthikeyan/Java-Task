package operatorsAndtypecasting;

public class Typecasttask {
	
	void StudentMarks() {
		int marks = 85;
        int totalMarks = 100;

        double percentage = ((double) marks / totalMarks) * 100;

        System.out.println("Percentage: " + percentage + "%");
	}
	
	void ProductPrice() {
		 double price = 999.50;
	     int quantity = 3;

	     double totalPrice = price * quantity;
	     double discount = (double) (totalPrice * 10) / 100;

	     totalPrice -= discount;

	     System.out.println("Final Price: Rs. " + totalPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Typecasttask obj = new Typecasttask();
		
		obj.StudentMarks();

		System.out.println();
		System.out.println();
		
		obj.ProductPrice();
	}

}
