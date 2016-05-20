package junit;

public class Fibo {
	
	/**
	 * fib (n) > Integer.MAX_VALUE
	 * 
	 * Computes the Fibonacci sequence numbers.
	 * Special cases:
	 * -fib (0) = 0
	 * -fib (1) = 1
	 * -fib (2) = 1
	 * @param n, 0 or positive integer
	 * @return int, the n-th number in the fibonacci sequence
	 * @throws IllegalArgumentException if n < 0 
	 * @throws IllegalArgumentException if fib(n) > Integer.MAX_VALUE
	 */

	public static int fib(int n) {
		if(n < 0) {throw new IllegalArgumentException ("n must be zero or positive number	");}
		if(n > 46) {throw new IllegalArgumentException ("nis too big, must be < 46	");}
		if(n == 0) { return 0; }
		if(n <= 2) { return 1; }
		
		
		// 3 = > 2
		// 4 => 3
		return fib(n - 1) + fib(n - 2);
	}

}
