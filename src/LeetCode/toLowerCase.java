package LeetCode;

public class toLowerCase {

    public String toLowerValue(String str) {

        StringBuilder sb = new StringBuilder();
        for(char c :str.toCharArray()){
            int v = c+32;
            Character.toChars(v);
            sb.append(v);
        }
        return sb.toString();
    }
}
