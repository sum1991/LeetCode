package LeetCode;

import java.util.HashMap;

public class emailAddr {

    public int numUniqueEmails(String[] emails) {
        // Removes whitespace between a word character and . or ,
        // String EXAMPLE_TEST ="test.email+alex@leetcode.com";
        String pattern = "[\\.]";
        HashMap<String, Integer> map
                = new HashMap<>();
        for(String s :emails){
            String[] str = s.split("[\\@]");
            str[0] = (str[0].split("[\\+]"))[0].replaceAll(pattern, "");
            String finalVal =  str[0].concat("@").concat(str[1]);
            if(map.containsKey(finalVal)){
                int val = map.get(finalVal);
                map.put(finalVal,val++);
            }else {
                map.put(finalVal,1);
            }
        }

        return map.size();
    }
}
