package LeetCode;

public class NumberOfDigits {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int n :nums){
            int len =Integer.toString(n).length();
            if(len%2==0) count++;
        }
        return count;
    }
}
