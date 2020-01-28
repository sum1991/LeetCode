import LeetCode.*;
public class main {
    public static void main(String[] args) {
        System.out.println("print the value");
        // ArrayPartition arrpair= new ArrayPartition();
        // peakIndex pk = new peakIndex();
        // int[] nums ={0,1,0};
       // String s="DDI";
        //DIString di = new DIString();
        //System.out.println(di.diStringMatch(s));

        /*RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(1);
        System.out.println(param_1);
        int param_2 = obj.ping(100);
        System.out.println(param_2);
        int param_3 = obj.ping(3001);
        System.out.println(param_3);
        int param_4 = obj.ping(3002);
        System.out.println(param_4);*/

        String[] s ={"cba","daf","ghi"};
        DeleteColumn dc = new DeleteColumn();
        dc.minDeletionSize(s);
        System.out.println(dc.minDeletionSize(s));
    }
}
