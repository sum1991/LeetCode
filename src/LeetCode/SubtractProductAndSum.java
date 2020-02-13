package LeetCode;

public class SubtractProductAndSum {

    public int subtractProductAndSum(int n) {

        String s = Integer.toString(n);
        char[] c = s.toCharArray();
        int sum=0,mul=1;
        for (char cr:c){
            sum = sum+Integer.parseInt(Character.toString(cr));
        }
        for (char cr:c){
            mul = mul*Integer.parseInt(Character.toString(cr));
        }
        return mul-sum;
    }
}
