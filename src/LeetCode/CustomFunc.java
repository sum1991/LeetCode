package LeetCode;
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CustomFunction {
      // Returns f(x, y) for any given positive integers x and y.
      // Note that f(x, y) is increasing with respect to both x and y.
      // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
      public int f(int x, int y) {
          return x+y;
      }
  };
public class CustomFunc {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> finalList= new ArrayList<>();
        for(int x=1;x<1000;x++){
            for(int y=1;y<1000;y++){
                if(customfunction.f(x,y)==z){
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(x);
                    l1.add(y);
                    finalList.add(l1);
                }
            }
        }
        return finalList;
    }
}
