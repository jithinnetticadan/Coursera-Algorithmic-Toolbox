import java.util.*;

import java.io.*;


public class CarFueling {

    static int computeMinRefills(int n, int tank, int[] stops) {

	int numrefill = 0;
	int currentrefill = 0;
	int lastrefill = 0;
	while(currentrefill <= n){
		lastrefill = currentrefill;
		while((currentrefill <= n) && ((stops[currentrefill+1] - stops[lastrefill])<= tank))
			currentrefill = currentrefill + 1;
		if(currentrefill == lastrefill)
			return -1;
		if(currentrefill <= n)
			numrefill = numrefill + 1;
	}
        return numrefill;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dist = scanner.nextInt();

        int tank = scanner.nextInt();

        int n = scanner.nextInt();

        int stops[] = new int[n+2];
	stops[0] = 0;

        for (int i = 1; i <= n; i++) {

            stops[i] = scanner.nextInt();

        }

	stops[n+1] = dist;

        System.out.println(computeMinRefills(n, tank, stops));

    }
}
