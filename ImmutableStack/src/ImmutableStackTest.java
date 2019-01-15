import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImmutableStackTest {
	
	private ImmutableStack<String> stack;
	
	@BeforeEach
	void setup() {
		stack = new ImmutableStack<String>();
	}

	@Test
	void canPushOneItem() {
		ImmutableStack<String> fooStack = stack.push("foo");
		assertEquals(0, stack.count(), "Original stack should have 0 elements.");
		assertEquals(1, fooStack.count(), "New stack should have 1 element.");
	}
	
	@Test
	void canPeek() {
		ImmutableStack<String> fooStack = stack.push("foo");
		assertEquals("foo", fooStack.peek(), "Should return 'foo'.");
		assertEquals("foo", fooStack.peek(), "Should still return 'foo'.");
	}
	
	@Test
	void canPopMultipleItems() {
		ImmutableStack<String> barStack = stack.push("foo").push("bar");
		ImmutableStack<String> fooStack = barStack.pop();
		ImmutableStack<String> emptyStack = fooStack.pop();
		assertEquals(2, barStack.count(), "Should return 2.");
		assertEquals(1, fooStack.count(), "Should return 1.");
		assertEquals(0, emptyStack.count(), "Should return 0.");
	}
}
