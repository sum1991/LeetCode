package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class replaceGRE {

    public int[] replaceElements(int[] arr) {

        ArrayList<Integer> arrList =new ArrayList<>();
        arrList.add(-1);
        int max=arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            if(max<arr[i]){
                max =arr[i];
            }

            arrList.add(max);
        }
        Collections.reverse(arrList);
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
