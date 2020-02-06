package LeetCode;

public class MinRange {
    public int smallestRangeI(int[] A, int K) {

        int min=A[0];
        int max=A[0];
        for(int i=0;i<A.length;i++){
            min = Math.min(min,A[i]);
            max= Math.max(max,A[i]);
        }
        return (min+K>=max-K)?0:(max-K)-(min+K);
    }
}
