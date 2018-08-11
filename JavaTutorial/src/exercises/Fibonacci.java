package exercises;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(6));
		System.out.println(fibIteration(6));
		System.out.println(fibRecursion(6));

	}	
	
	//O(n) time-complexity; O(1) space-complexity. RETURN FIB NUMBER @ REQUESTED INDEX.
	public static int fibonacci(int n) {
	    int[] fib = new int[2]; 
	    fib[0] = 0; fib[1] = 1;
	    for (int i = 2; i <= n; ++i) {
	        fib[i % 2] = fib[0] + fib[1];
	    }
	    return fib[n % 2];
	}
	
	//Iteration method
    static int fibIteration(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    //Recursive method
    static int fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}

