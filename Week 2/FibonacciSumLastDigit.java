import java.util.*;
public class FibonacciSumLastDigit {
    static long getFibonacciSumeff(long n) {
        if (n <= 1)
            return n;
	long prev = 0;
        long curr = 1;
        long sum = 1;
	for (long i = 0; i < n - 1; ++i) {
            long tmp = prev;
            prev = curr;
            curr = tmp + curr;
            sum += curr;
        }
	return sum % 10;
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
	n = n % 60;
        System.out.println(getFibonacciSumeff(n));
    }
}
