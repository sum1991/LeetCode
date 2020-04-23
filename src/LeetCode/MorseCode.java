package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MorseCode {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morsecode ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> arrList =new HashSet<>();

        for (int i =0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                String str = morsecode[(int)words[i].charAt(j)-97];
                sb.append(str);
            }
            arrList.add(sb.toString());
        }

        return arrList.size();
    }
}
