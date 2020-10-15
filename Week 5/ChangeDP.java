import java.util.Scanner;
public class ChangeDP {
    static int getChange(int m) {
        int[] mincoin = new int[m+1];
	int[] coins = {1,3,4};
	int numcoins = 0;
	mincoin[0] = 0;
	for(int i = 1;i<=m;i++){
		mincoin[i] = Integer.MAX_VALUE;
		for(int j = 0;j<coins.length;j++){
			if(i>= coins[j])
				numcoins = mincoin[i - coins[j]] + 1;
			        if(numcoins<mincoin[i])
					mincoin[i] = numcoins;
		}
	}
	return mincoin[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

