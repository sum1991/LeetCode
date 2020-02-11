package LeetCode;

public class DefrangingIP {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
