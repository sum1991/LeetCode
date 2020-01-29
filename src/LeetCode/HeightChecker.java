package LeetCode;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {

        int[] val = heights.clone();
        int totalStudents=0;
        Arrays.sort(val);
        for (int i =0;i<heights.length;i++){
            if(heights[i]!=val[i]){
                totalStudents++;
            }
        }
        return totalStudents;
    }
}
