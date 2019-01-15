
public class GenericStack<T> {

	private T[] stack;
	private int currentIndex;
	
	@SuppressWarnings("unchecked")
	public GenericStack(int capacity) {
		stack = (T[]) new Object[capacity];
		currentIndex = 0;
	}
	
	public T pop() {
		if (currentIndex == 0)
			return null;
		else
			return stack[--currentIndex];
	}
	
	public void push(T t) throws IllegalArgumentException {
		if (t == null)
			throw new IllegalArgumentException("Can't push null!");
		else
			stack[currentIndex++] = t;
	}
	
	public T peek() {
		return stack[currentIndex - 1];
	}

	public static void main(String[] args) {
		// test class here
		GenericStack<String> gs = new GenericStack<String>(100);
		gs.push("foo");
		System.out.println(gs.peek());
		gs.push("bar");
		System.out.println(gs.peek());
		System.out.println(gs.pop());
		System.out.println(gs.pop());
		gs.push(null);
	}


}
