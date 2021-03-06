import static org.junit.jupiter.api.Assertions.assertEquals ;
import static org.junit.jupiter.api.Assertions.assertThrows ;
import org.junit.jupiter.api.BeforeEach ;
import org.junit.jupiter.api.Test ;

class GenericStackTest {
	
	private GenericStack<String> gs;
	
	@BeforeEach
	void setup() {
		gs = new GenericStack<String>(100);
	}

	@Test
	void canPopOneItem() {
		gs.push("foo");
		assertEquals("foo", gs.pop(), "Should pop 'foo'");
	}
	
	@Test
	void canPopMultipleItems() {
		gs.push("foo");
		gs.push("bar");
		assertEquals("bar", gs.pop(), "Should pop 'bar'");
		assertEquals("foo", gs.pop(), "Should pop 'foo'");
	}
	
	@Test
	void canPopFromEmptyStack() {
		assertEquals(null, gs.pop(), "Can pop empty stack");
	}
	
	@Test
	void shouldNotBeAbleToPushNull() {
		assertThrows(IllegalArgumentException.class, () -> {gs.push(null);},
				"Should not push null");
	}
}