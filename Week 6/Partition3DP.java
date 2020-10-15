import java.util.*;
import java.io.*;

public class Partition3DP{

   static boolean findPartition(int arr[], int n) 
    { 
        int sum = 0; 
        int i, j;  
        for (i = 0; i < n; i++) 
            sum += arr[i]; 
  
        if (sum%3 != 0) 
            return false; 
  
        boolean part[][]=new boolean[sum/3+1][n+1]; 
        for (i = 0; i <= n; i++) 
            part[0][i] = true; 
  	// initialize leftmost column, except part[0][0], as 0 
        for (i = 1; i <= sum/3; i++) 
            part[i][0] = false; 
  
        // Fill the partition table in bottom up manner 
        for (i = 1; i <= sum/3; i++) 
        { 
            for (j = 1; j <= n; j++) 
            { 
                part[i][j] = part[i][j-1]; 
                if (i >= arr[j-1]) 
                    part[i][j] = part[i][j] || 
                                 part[i - arr[j-1]][j-1]; 
            } 
        } 
  
        /* // uncomment this part to print table 
        for (i = 0; i <= sum/3; i++) 
        { 
            for (j = 0; j <= n; j++) 
                printf ("%4d", part[i][j]); 
            printf("\n"); 
        } */
  
        return part[sum/3][n]; 
    } 
  
    /*Driver function to check for above function*/
    public static void main (String[] args) 
    { 
	Scanner scan = new Scanner(System.in)
	int n = scan.nextInt();
        int arr[] = new int[n];
	for(int i=0;i<n;i++)
		arr[i] = scan.nextInt();
        if (findPartition(arr, n)) 
            System.out.println(1); 
        else
            System.out.println(0); 
  
    } 
} 