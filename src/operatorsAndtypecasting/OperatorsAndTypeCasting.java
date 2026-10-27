package operatorsAndtypecasting;

public class OperatorsAndTypeCasting {
	
	void ArithmeticOperator(int a, int b) {
		
		System.out.println("Sum : " + (a+b));
		System.out.println("Difference : " + (a-b));
		System.out.println("Product : " + (a*b));
		System.out.println("Division : " + (a/b));
	}
	
	void RelationalOperator(int a, int b) {
		System.out.println("Equal : " + (a==b));
		System.out.println("Greater : " + (a>=b));
		System.out.println("Smaller : " + (a<=b));
	}
	
	void AssignmentOperator() {
		int a = 10;
		System.out.println("a : " + a);
		
		a += 10; 
		System.out.println("a += : " + a);
		
		a -= 5;
		System.out.println("a -= : " + a);
		
		a *= 2;
		System.out.println("a *= : " + a);
		
		a /= 2;
		System.out.println("a /= : " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorsAndTypeCasting obj = new OperatorsAndTypeCasting();
		
		obj.ArithmeticOperator(10, 5);
		
		System.out.println();
		System.out.println();
		
		obj.RelationalOperator(5, 4);
		
		System.out.println();
		System.out.println();
		
		obj.AssignmentOperator();
		
	}

}