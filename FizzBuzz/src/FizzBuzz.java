
public class FizzBuzz {
	
	public String getResult(int n) {
		String r = ""; // stores return value
		
		if (isDivisibleByThree(n)) {
			r += "Fizz";
			if (isDivisibleByFive(n))
				r += "Buzz";
		}
		else if (isDivisibleByFive(n))
			r += "Buzz";
		else
			r += String.valueOf(n);
		
		return r;
	}
	
	private boolean isDivisibleByThree(int n) {
		return n % 3 == 0;
	}
	
	private boolean isDivisibleByFive(int n) {
		return n % 5 == 0;
	}

	public static void main(String[] args) {
		// test class here
		FizzBuzz fb = new FizzBuzz();
		for (int n = 1; n < 31; n++)
			System.out.println(fb.getResult(n));
	}

}
