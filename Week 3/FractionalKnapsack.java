import java.util.Scanner;


public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {

        double value = 0, swap = 0;
	int tmp = 0;
	int n = values.length;

	double[] arr = new double[n];
        for(int i=0;i<n;i++)
		arr[i] = (double)values[i]/(double)weights[i];
	for(int i = 0; i<n-1 ; i++){
		for(int j = 0; j<n-i-1; j++){
			if(arr[j]<arr[j+1]){
				swap = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = swap;
				tmp = weights[j];
				weights[j] = weights[j+1];
				weights[j+1] = tmp;
				tmp = values[j];
				values[j] = values[j+1];
				values[j+1] = tmp;
			}
		}
	}
	for(int i = 0; i<n && capacity!=0; i++){
		if(capacity>=weights[i]){
			capacity -= weights[i];
			value += values[i];
		}
		else{
			value += (arr[i]*capacity);
			capacity = 0;
		} 
	}
        return value;

    }


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int capacity = scanner.nextInt();

        int[] values = new int[n];

        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {

            values[i] = scanner.nextInt();

            weights[i] = scanner.nextInt();

        }

        System.out.println(getOptimalValue(capacity, values, weights));

    }

} 
