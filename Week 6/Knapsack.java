import java.util.*;
public class Knapsack {
    static int optimalWeight(int W, int[] w) {
	int n = w.length;
        int [][] max = new int [W + 1][n + 1];
        for (int j = 0; j <= W; j++) {
		 for (int i = 0; i<= n; i++) {
		 	if (i == 0 || j == 0) 
                    		max[j][i] = 0;
                	 else {
				int val = Integer.MIN_VALUE;
                    		if (w[i-1] <= j) 
                        		val = max[j - w[i-1]][i-1] + w[i-1];
                    	max[j][i] = Math.max(val, max[j][i-1]);
                        }
               	}
       	}
	return max[W][w.length];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}
