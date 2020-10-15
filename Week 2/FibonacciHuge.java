import java.util.*;
public class FibonacciHuge {
	static long FibonacciHugeeff(long n,long m) {
		if (n<= 1)
			return n;
		n=n%PeriodLength(m);
		if(n==0) {
			return 0;
		}
		long first=0;
		long second=1;
		for (long i=2;i<=n;i++) {
			long temp=first;
			first=second;
			second=(temp+second)%m;
		}
		return second%m;
	}
	static long PeriodLength(long m) {
		long mod1 = 0;
		long mod2 = 1;
                long fib = mod1 + mod2;
		for (long i=0;i<m*m;i++) {
			fib=(mod1+mod2)%m;
			mod1=mod2;
			mod2=fib;
			if (mod1==0 && mod2==1)
				return i+1;
		}
		return -1;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	long n = scanner.nextLong();
	long m = scanner.nextLong();
	System.out.println(FibonacciHugeeff(n,m));
	}
}