import java.io.*;
import java.util.*;
public class Sorting {
    static Random random = new Random();
    static int[] partition3(int[] a, int l, int r) {
      int pivot = a[l], k = l;     
      int m1 = l;
      int m2 = r;
      int[] m = {m1, m2};
      while(k<=m2){
	if(a[k]==pivot)
		k += 1;
	else if(a[k]<pivot){
		int t = a[k];
		a[k] = a[m1];
		a[m1] = t;
		k += 1;
		m1 += 1;
	}
	else if(a[k]>pivot){
		int t = a[k];
		a[k] = a[m2];
		a[m2] = t;
		m2 -= 1;
	}
	m[0] = m1;
	m[1] = m2;
      }
      return m;
    }
    private static void randomizedQuickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int k = random.nextInt(r - l + 1) + l;
        int t = a[l];
        a[l] = a[k];
        a[k] = t;
        int[] m = partition3(a, l, r);
        randomizedQuickSort(a, l, m[0] - 1);
        randomizedQuickSort(a, m[1] + 1, r);
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
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

