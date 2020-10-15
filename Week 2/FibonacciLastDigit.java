import java.util.*;


public class FibonacciLastDigit {

    private static int getFibonacciLastDigiteff(int n) {

        int[] array = new int[60];

	if(n==1 || n==0) 
   		  return n;
        else{
		array[0]=0;
                array[1]=1;
   	  	for (int i = 2; i <= 59; i++)
   	  		array[i]=(array[i-1]+array[i-2])%10;
	}
        n=(int)(n%60L);
        return array[n];
    }    

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int c = getFibonacciLastDigiteff(n);

        System.out.println(c);

    }
}

