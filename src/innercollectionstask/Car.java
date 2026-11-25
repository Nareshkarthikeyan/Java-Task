package innercollectionstask;

public class Car {
	
	    String carName = "BMW";

	    // Inner Class
	    class Engine {
	        String engineType = "Petrol Engine";
	        void display() {
	            System.out.println("Car Name: " + carName);
	            System.out.println("Engine Type: " + engineType);
	        }
	    }

	    public static void main(String[] args) {
	        Car myCar = new Car();
	        // Inner class object create panra method idhu dhaan
	        Car.Engine myEngine = myCar.new Engine();
	        myEngine.display();
	    }
	}

