package LeetCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    ArrayList<Integer> arr;
    public RecentCounter(){
        arr = new ArrayList<>();

    }
    public int ping(int t){
        arr.add(t);
        int totalVal=0;
        int len = arr.size()-1;
        while (len>=0){
            if((t-arr.get(len))<=3000){
                totalVal++;
            }else {
                break;
            }
            len--;
        }
        return totalVal;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */