import java.util.*;


public class LCM {

  static long lcm_eff(long a, long b) {

    long remain=0;
    long x=a;
    long y=b;	
    while(b!=0){
	remain=a%b;
	a=b;
	b=remain;
    }
    return (x*y)/a; 
  }


  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    long a = scanner.nextLong();

    long b = scanner.nextLong();


    System.out.println(lcm_eff(a, b));

  }
}
