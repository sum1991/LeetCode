package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Reverse3 {

    public String reverseWords(String s) {

        String[] splitsReverse = s.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for (String str : splitsReverse){
            char[] arr = str.toCharArray();
            for (int i=arr.length-1;i>=0;i--){
                strBuilder.append(arr[i]);
            }
            strBuilder.append(' ');
        }
        return strBuilder.toString().trim();
    }
}
