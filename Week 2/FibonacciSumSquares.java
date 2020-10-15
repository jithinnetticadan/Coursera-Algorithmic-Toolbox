import java.util.*;
public class FibonacciSumSquares{
	static long getFibonacciSumSquares(long n) {
		if (n <= 1)
			return n;

		long prev= calcfib(n % 60);
		long curr = calcfib((n + 1) % 60);
		return ((prev % 10) * (curr % 10) % 10);
	}
	static long calcfib(long n) {
		if (n == 1 || n == 0) {
			return n;
		}

		long a = 0;
		long b = 1;
		long c = 0;
		for (long i = 2; i <= n; i++) {
			c= a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long t = getFibonacciSumSquares(n);
		System.out.println(t);
	}
}