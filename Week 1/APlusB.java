import java.util.Scanner;


class APlusB {
    
	static int digitsum(int x, int y) {
  
      		return x+y;
 
   	}

    
	public static void main(String[] args) {
       
 		Scanner s = new Scanner(System.in);
        
		int x = s.nextInt();
        
		int y = s.nextInt();
        
		System.out.println(digitsum(x, y));
   
 	}

}