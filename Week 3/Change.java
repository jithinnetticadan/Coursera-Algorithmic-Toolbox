import java.util.Scanner;
public class Change {
    static long getChange(int m) {
        int k = 0;
	while (m > 0) {
		while (m > 0 && m - 10 >= 0) {
			m = m - 10;
			k +=1;
		}
		while (m > 0 && m - 5 >=0) {
			m  = m -5;
			k +=1;
		}
		while ( m > 0 && m -1 >=0) {		
			m = m - 1;
			k +=1;
		}
	}
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}