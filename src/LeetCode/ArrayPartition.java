package LeetCode;
import java.util.Arrays;

public class ArrayPartition {
    public int arrpairsum(int nums[]){
        Arrays.sort(nums);
        int groupBy = 2;
        int total=0;
        for(int j=0;j<nums.length;j=(j+groupBy)){
            if(j+1==nums.length)
                break;
            total =total + nums[j];
        }
        return total;
    }
}
