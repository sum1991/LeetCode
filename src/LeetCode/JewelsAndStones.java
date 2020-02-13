package LeetCode;

import java.util.HashMap;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> js = new HashMap<>();
        for (Character c:S.toCharArray()){
            if(js.containsKey(c)){
                int count = js.get(c);
                count++;
                js.put(c,count);
            }else {
                js.put(c,1);
            }
        }
        int totalStones=0;
        for (Character c:J.toCharArray()){
            if(js.containsKey(c)){
                totalStones = totalStones + js.get(c);
            }
        }
        return totalStones;
    }
}
