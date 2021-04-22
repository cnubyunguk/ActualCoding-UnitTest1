import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
	private CustomCalculator customCalculator;

	// execute add test
	@Test
	public void addTest(){
		customCalculator = new CustomCalculator();
		int result = customCalculator.add(10, 10);
		/* 테스트 코드 입력 */
		assertTrue(result == 20);
	}

	@Test
	public void subTest(){
		customCalculator = new CustomCalculator();
		int result = customCalculator.subtract(10, 10);
		assertTrue(result == 0);
	}

	@Test
	public void mulTest(){
		customCalculator = new CustomCalculator();
		int result = customCalculator.multiply(10, 10);
		assertTrue(result == 100);
	}

	@Test
	public void divTest(){
		customCalculator = new CustomCalculator();
		int result = customCalculator.divide(10, 10);
		assertTrue(result == 1);
	}

}