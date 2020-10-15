import java.util.*;
class EditDistance {
     static int EditDistance(String s, String t) {
	int [][] dist = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i <= s.length(); i++) 
            dist[i][0] = i;
	for (int j = 0; j <= t.length(); j++)
            dist[0][j] = j;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <=t.length(); j++) {
                dist[i][j] = Integer.MAX_VALUE;
                if (s.charAt(i-1) == t.charAt(j-1))
                    dist[i][j] = dist[i-1][j-1];
                int mismatch = dist[i-1][j-1] + 1;
                int insertion = dist[i][j-1] + 1;
                int deletion = dist[i-1][j] + 1;
                dist[i][j] = min(dist[i][j] , mismatch, insertion, deletion);
            }
        }
        return dist[s.length()][t.length()];
    }

    static int min(int ...arr) {
        int minimum = arr[0];
        for (int i = 1; i< arr.length; i++){
            minimum = Math.min(minimum, arr[i]);
        }
        return minimum;
    }
    
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}