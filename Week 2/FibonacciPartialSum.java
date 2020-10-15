import java.util.*;
public class FibonacciPartialSum {
	private static long getFibonacciPartialSum(long m, long n) {
		long sum = 0;
		m = m % 60;
		n = n % 60;
		if (n < m) 
			n += 60;
		long prev = 0;
		long current = 1;

		for (long i = 0; i <= n; ++i) {
			if (i >= m) {
				sum += prev;
			}

			long tmp = current;
			current = current + prev;
			prev = tmp;
		}

		return sum % 10;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long m = scanner.nextLong();
		long n = scanner.nextLong();
		System.out.println(getFibonacciPartialSum(m, n));
	}
}