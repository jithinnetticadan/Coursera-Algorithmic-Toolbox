import java.util.Scanner;


public class Fibonacci {

    static int calc_fib(int n) {
    int[] array = new int[n+2];

    array[0] = 0;
    array[1] = 1;
    for(int i=2;i<=n;i++){
	array[i]=array[i-1]+array[i-2];
    }
    return array[n];

  }


  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    System.out.println(calc_fib(n));
 }

}
