package LeetCode;


/*
*
* incomplete problem
*not able to find out what it is
*
* */

import java.util.ArrayList;

public class max69number {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        char[] ch = Integer.toString(num).toCharArray();
        int index=-1;
        for (int i =0;i<ch.length;i++){
            if(ch[i]=='6'){
                sb.append('9');
                index =i;
                break;
            }else {
                sb.append(ch[i]);
            }
        }
        if(index>=0){
            sb.append(Integer.toString(num).substring(index+1));
        }

        return Integer.parseInt(sb.toString());
    }

}
