import java.util.*;


public class DifferentSummands {

    private static List<Integer> optimalSummands(int n) {

        List<Integer> summands = new ArrayList<Integer>();

        int count=0, index=0;
	while(n!=0){
		if(n/2>=index){
			int index1=index;
			while(((index1==index) && (index<=n)) || ((float)n/2<=index)){
				index +=1;
				if(index==n)
					break;
			}
			summands.add(index);
			n -=index;
		}
		else{
			summands.add(n);
			n=0;
		}
	}
        return summands;

    }

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> summands = optimalSummands(n);

        System.out.println(summands.size());

        for (Integer summand : summands) {

            System.out.print(summand + " ");

        }

    }
}

