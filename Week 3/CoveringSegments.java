import java.util.*;
public class CoveringSegments {
    static int k=0;
    private static int[] optimalPoints(Segment[] segments) {
        int n=segments.length;
	int[] points = new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(segments[j].end>segments[j+1].end){
                    int temp=segments[j].end;
                    segments[j].end=segments[j+1].end;
                    segments[j+1].end=temp;
                    temp=segments[j].start;
                    segments[j].start=segments[j+1].start;
                    segments[j+1].start=temp;
                }
            }
        }
        int i=0;
        int point=segments[0].end;
        points[0]=point;
        k=1;
        while(i<n-1){
            i++;
            if(segments[i].end>=point && segments[i].start<=point)
            continue;
            else{
                point=segments[i].end;
                points[k]=segments[i].end;
                k +=1;
            }
        }
        return points;
    }

    private static class Segment {
        int start, end;
	Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(k);
        for (int i=0;i<k;i++) {
            System.out.print(points[i] + " ");
        }
    }
}