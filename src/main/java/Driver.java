import src.main.java.Calculator;

public class Driver {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println("Result:" + calculator.getCount());
		
		calculator.increment();
		
		System.out.println("Result:" + calculator.getCount());
		
		calculator.decrement();
		
		System.out.println("Result:" + calculator.getCount());
		
	}

}
