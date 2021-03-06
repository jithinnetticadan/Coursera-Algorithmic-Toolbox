import java.util.*;
public class DotProduct {
    static long maxDotProduct(long[] a, long[] b, int n) {
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    long tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n-i-1;j++){
                if(b[j]>b[j+1]){
                    long tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;
                }
            }
        }
        long result = 0;
        for (int i = 0; i <n; i++) {
            result = result + (a[i] * b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) 
            a[i] = scanner.nextLong();
        long[] b = new long[n];
        for (int i = 0; i < n; i++) 
            b[i] = scanner.nextLong();
        System.out.println(maxDotProduct(a, b,n));
    }
}