
public class StringStack {
	
	private String[] stack;
	private int currentIndex;
	
	public StringStack(int capacity) {
		stack = new String[capacity];
		currentIndex = 0;
	}
	
	public String pop() {
		if (currentIndex == 0)
			return null;
		else
			return stack[--currentIndex];
	}
	
	public void push(String s) throws IllegalArgumentException {
		if (s == null)
			throw new IllegalArgumentException("Can't push null!");
		else
			stack[currentIndex++] = s;
	}
	
	public String peek() {
		return stack[currentIndex - 1];
	}

	public static void main(String[] args) {
		// test class here
		StringStack ss = new StringStack(100);
		ss.push("foo");
		System.out.println(ss.peek());
		ss.push("bar");
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		ss.push(null);
	}

}
