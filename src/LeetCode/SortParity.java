package LeetCode;

import java.util.ArrayList;

public class SortParity {

    public int[] sortArrayByParityII(int[] A) {
        ArrayList<Integer> evenArray= new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int a :A){
            if(a%2==0){
                evenArray.add(a);
            }else {
                oddArray.add(a);
            }
        }
        int even=0,odd=0;
        for (int i=0;i<A.length;i++){
            if(i%2==0){
                newArr.add(evenArray.get(even));
                even++;
            }else{
                newArr.add(oddArray.get(odd));
                odd++;
            }
        }
        return toIntArray(newArr);
    }

    int[] toIntArray(ArrayList<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }
}
