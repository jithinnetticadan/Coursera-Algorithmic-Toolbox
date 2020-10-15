import java.util.*;
public class PrimitiveCalculator {
    static List<Integer> optimal_sequence(int n) {
        if (n == 1) 
		return Arrays.asList(1);
	List<Integer> sequence = new ArrayList<Integer>();
        int[] operations = new int[n+1];
        operations[0] = 0;
        operations[1] = 0;
        for (int i = 2; i<=n; i++) {
	    int twice = Integer.MAX_VALUE;
            int thrice = Integer.MAX_VALUE;
            int add = Integer.MAX_VALUE;
	    if (i%2 == 0)
                twice = operations[i/2] + 1;
            if (i%3 == 0)
                thrice = operations[i/3] + 1;
            if (i - 1 >= 0)
                add = operations[i-1] + 1;
            operations[i] = Math.min(twice, Math.min(thrice,add));
        }
        while(n > 1) {
            sequence.add(n);
            if (operations[n] == operations[n-1] + 1) 
                n -= 1;
            else if (operations[n] == operations[n/2] + 1 && n%2 == 0)
                n /= 2;
            else if (operations[n] == operations[n/3] + 1 && n%3 == 0)
                n /= 3;
        }
	sequence.add(1);
        Collections.reverse(sequence);
	return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}


