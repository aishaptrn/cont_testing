import src.main.java.Calculator;

public class Driver {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println("Current count:" + calculator.getCount());
		
		calculator.increment();
		
		System.out.println("Current count:" + calculator.getCount());
		
		calculator.decrement();
		
		System.out.println("Current count:" + calculator.getCount());
		
	}

}
