import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringStackTest {
	
	private StringStack ss;
	
	@BeforeEach
	void setup() {
		ss = new StringStack(100);
	}

	@Test
	void canPopOneItem() {
		ss.push("foo");
		assertEquals("foo", ss.pop(), "Should pop 'foo'");
	}
	
	@Test
	void canPopMultipleItems() {
		ss.push("foo");
		ss.push("bar");
		assertEquals("bar", ss.pop(), "Should pop 'bar'");
		assertEquals("foo", ss.pop(), "Should pop 'foo'");
	}
	
	@Test
	void canPopFromEmptyStack() {
		assertEquals(null, ss.pop(), "Can pop empty stack");
	}
	
	@Test
	void shouldNotBeAbleToPushNull() {
		assertThrows(IllegalArgumentException.class,
				() -> {ss.push(null);},
				"Should not push null");
	}
}
