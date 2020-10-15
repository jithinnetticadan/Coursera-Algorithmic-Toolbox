import java.util.*;
public class Inversions {
    static int merge(int[] a, int[] b, int left, int mid, int right) {
        int i = left, j = mid, k = left, count = 0;
        while (i <= mid - 1 && j <= right) {
            if (a[i] <= a[j])
                b[k++] = a[i++];
            else {
                count += mid - i;  
                b[k++] = a[j++]; 
            }
	} 
        while (i <= mid - 1)
        	b[k++] = a[i++];
	while (j <= right)
            	b[k++] = a[j++];
	for (i=left; i <= right; i++)
	    	a[i] = b[i];
	return count;
    }
    static int NumberOfInversions(int[] a, int[] b, int left, int right) {
        int count = 0;
        if (right <= left)
        	return count;
        int mid = left + ((right - left) / 2);
        count += NumberOfInversions(a, b, left, mid);
        count += NumberOfInversions(a, b, mid + 1, right);
        count += merge(a,b, left, mid+1, right);
	return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        	a[i] = scanner.nextInt();
        int[] b = new int[n];
        System.out.println(NumberOfInversions(a, b, 0, a.length - 1));
    }
}
