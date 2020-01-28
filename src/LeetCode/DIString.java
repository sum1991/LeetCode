package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DIString {


    public int[] diStringMatch(String S){
        int low=0;
        int high=S.length();
        ArrayList<Integer> ArrayVal= new ArrayList<Integer>();
        for (int i =0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                ArrayVal.add(low);
                low++;
            }else{
                ArrayVal.add(high);
                high--;
            }
        }
        ArrayVal.add(high);
        return convertIntegers(ArrayVal);
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
