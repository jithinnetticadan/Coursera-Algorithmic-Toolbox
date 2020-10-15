import java.util.*;


public class GCD {

    static int gcd_eff(int a, int b) {
    int remain=0;	
    while(b!=0){
	remain=a%b;
	a=b;
	b=remain;
    }
    return a;
  }


  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    int b = scanner.nextInt();


    System.out.println(gcd_eff(a,b));

  }

}
