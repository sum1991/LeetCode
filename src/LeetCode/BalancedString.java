package LeetCode;

import java.util.Stack;

public class BalancedString {
    public int balancedStringSplit(String s) {
        int rcount=0;
        int lcount=0;
        int balance=0;
        for (Character c:s.toCharArray()){
            if(c=='L'){
                lcount++;
            }else {
                rcount++;
            }
            if(lcount==rcount){
                balance++;
            }

        }
        return balance;
    }
}
