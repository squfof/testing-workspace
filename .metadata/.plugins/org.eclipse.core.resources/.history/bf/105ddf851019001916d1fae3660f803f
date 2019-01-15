
public class ImmutableStack<T> {
	
	// basically, this how Scheme constructs lists, where:
	// item = (car ...)
	// previousStack = (cdr ...)
	private T item;
	private int stackSize;
	private ImmutableStack<T> previousStack;
	

	public ImmutableStack() {
		item = null;
		stackSize = 0;
		previousStack = null;
	}
	
	public ImmutableStack(T item, int stackSize, ImmutableStack<T> previousStack) {
		this.item = item;
		this.stackSize = stackSize;
		this.previousStack = previousStack;
	}
	
	public int count() {
		return stackSize;
	}
	
	public ImmutableStack<T> pop() {
		return previousStack;
	}
	
	public ImmutableStack<T> push(T t) throws IllegalArgumentException {
		return new ImmutableStack<T>(t, stackSize + 1, this);
	}
	
	public T peek() {
		return item;
	}

	public static void main(String[] args) {
		// test class here
		System.out.println("Hello, World!");
	}
}
