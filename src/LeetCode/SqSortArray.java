package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class SqSortArray {

    public int[] sortedSquares(int[] A) {
        int[] newArr = new int[A.length];
        int index =0;

        while (index < A.length){
            newArr[index] = A[index]*A[index];
            index++;
        }
        Arrays.sort(newArr);
        return newArr;

    }

}
