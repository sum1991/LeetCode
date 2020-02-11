package LeetCode;


import java.util.*;


/**
 * incomplete solution
 */
public class RSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ret={1,2};
        List<Integer> listarr = new ArrayList<>();
        HashMap<Integer,Integer> mapVal = new HashMap<>();
        Arrays.sort(arr1);
        for(int val:arr1){
            if(mapVal.containsKey(val)){
                int count = mapVal.get(val);
                count++;
                mapVal.put(val,count);
            }else {
                mapVal.put(val,1);
            }
        }
        for(int val2:arr2){
           int count = mapVal.get(val2);
           while (count>0){
               listarr.add(val2);
               count--;
               mapVal.remove(val2);
           }
        }
        for(int rsa: mapVal.keySet()){
            listarr.add(rsa);
        }

        return convertIntegers(listarr);
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
