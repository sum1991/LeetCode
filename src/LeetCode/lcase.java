package LeetCode;

public class lcase {

    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char vb = str.charAt(i);
            int aciiVal = (int) vb;
            if(aciiVal<=90 && aciiVal >=65){
                 vb = (char) (aciiVal+32);
            }
            sb.append(vb);
        }
        return sb.toString();
    }
}
