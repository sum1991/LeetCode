package LeetCode;
public class peakIndex {
    public int peakIndexInMountainArray(int [] A){
        int index = 0;
        for (int j=0;j<A.length;j++){
            if(A[j]>A[j+1]){
                index =j;
                break;
            }

        }
        return index;
    }
}

