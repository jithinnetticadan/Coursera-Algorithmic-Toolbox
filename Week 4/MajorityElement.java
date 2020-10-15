import java.util.*;
import java.io.*;
public class MajorityElement {
    static int getMajorityElement(int[] a, int low, int high) {
	int n = high - low, majority = 0, count = 1, total = 0;
	if (low == high){
            return -1;
        }
        if (low + 1 == high){
            return a[low];
        }
        for (int i = low + 1 ;i< high; i++){
            if (a[i] == a[majority])
		 count += 1;
            else
                count -= 1;
            if (count == 0){
                majority = i;
                count = 1;
            }
        }
        for (int i = low; i < high; i++) {
            if (a[i] == a[majority]) 
		total += 1;
        } 
	if (total > n/2)
		 return majority;
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

