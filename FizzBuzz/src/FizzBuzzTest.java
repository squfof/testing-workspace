import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fb = new FizzBuzz();
	
	@Test
	void shouldPrintNumber() {
		assertEquals("1", fb.getResult(1), "1 should produce 1");
	}
	
	@Test
	void shouldPrintFizz() {
		assertEquals("Fizz", fb.getResult(3), "3 should produce 'Fizz'");
	}
	
	@Test
	void shouldPrintBuzz() {
		assertEquals("Buzz", fb.getResult(5), "5 should produce 'Buzz'");
	}
	
	@Test
	void shouldPrintFizzBuzz() {
		assertEquals("FizzBuzz", fb.getResult(15), "15 should produce 'FizzBuzz'");
	}
}
