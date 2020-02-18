package LeetCode;

public class decryptAlphabet {

    public String freqAlphabets(String s) {
        int j=0;
        int CHAR_VALUE_A= 97;
        int CHAR_VALUE_J= 106;
        char[] cs = s.toCharArray();
        StringBuilder newstr = new StringBuilder();
        while (j<s.length()){
            StringBuilder sb = new StringBuilder();
            if((j+2 <s.length()) && cs[j+2]=='#'){
                sb.append(cs[j]).append(cs[j+1]);
                int val = Integer.parseInt(sb.toString())-10;
                newstr.append((char) ((char)CHAR_VALUE_J+(char)(val)));
                j= j+3;
            }else{
                sb.append(cs[j]);
                int val = Integer.parseInt(sb.toString())-1;
                newstr.append((char) ((char)CHAR_VALUE_A+(char)(val)));
                j++;
            }
        }
        return newstr.toString();
    }
}
