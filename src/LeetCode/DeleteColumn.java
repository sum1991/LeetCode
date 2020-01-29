package LeetCode;

import java.util.ArrayList;

public class DeleteColumn {

    public int minDeletionSize(String[] A) {
        int countChar=0;
        ArrayList<Integer> index = new ArrayList<>();
        boolean AddIndex=true;
        while(countChar<=A[0].length()-1){
            AddIndex = true;
            for(int i=0;i<(A.length-1);i++){
                if(A[i].charAt(countChar)>A[i+1].charAt(countChar)){
                    index.add(countChar);
                    break;
                }
            }
            countChar++;
        }
        return index.size();
    }
}
