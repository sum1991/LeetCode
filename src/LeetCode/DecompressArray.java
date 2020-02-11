package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DecompressArray {


    public int[] decompressRLElist(int[] nums) {
        int[] arr = {1,2};
        ArrayList<Integer>dcompList = new ArrayList<>();
        int index=0;
        while(index<nums.length){
           int freq = nums[index];
           int val = nums[index+1];
            for(int f=1;f<=freq;f++){
                dcompList.add(val);
            }
            index = index+2;
        }

        return convertIntegers(dcompList);
    }
    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

}


