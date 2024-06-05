package src.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import src.main.java.Calculator;

public class CalculatorTest {

	@Test
	public void testReset() {
		Calculator testCalculator = new Calculator();
		
		for(int i = 0; i <10; i++) {
			testCalculator.increment();
		}
		
		testCalculator.reset();
		
		assertEquals(testCalculator.getCount(), 0);
	}

	@Test
	public void testIncrement() {
		Calculator testCalculator = new Calculator();
		
		for(int i = 1; i <10; i++) {
			testCalculator.increment();
			assertEquals(testCalculator.getCount(), i);
		}
	}

	@Test
	public void testDecrement() {
		Calculator testCalculator = new Calculator();
		
		for(int i = 1; i <10; i++) {
			testCalculator.decrement();
			assertEquals(testCalculator.getCount(), i * -1);
		}
	}

}
