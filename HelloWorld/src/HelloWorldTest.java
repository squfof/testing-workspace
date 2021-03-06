import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	
	private HelloWorld h = new HelloWorld();

	@Test
	void nameShouldBeEmpty() {
		h.setName("");
		assertEquals("", h.getName(), "Name should be empty!");
	}
	
	@Test
	void messageShouldBeHello() {
		h.setName("");
		assertEquals("Hello!", h.getMessage(), "Message should be 'Hello!'");
	}
	
	@Test
	void nameShouldBeJason() {
		h.setName("Jason");
		assertEquals("Jason", h.getName(), "Name should be 'Jason'");
	}

	@Test
	void messageShouldBeHelloJason() {
		h.setName("Jason");
		assertEquals("Hello Jason!", h.getMessage(), "Message should be 'Hello Jason!'");
	}
}
