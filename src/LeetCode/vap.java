package LeetCode;

public class vap {
    public int minTimeToVisitAllPoints(int[][] points) {


        if(points.length < 2){return 0;}
        int totalTime = 0;
        int[] currCoordinate = new int[2];
        int[] nextCoordinate = new int[2];
        for(int i=0; i<points.length-1; i++){
            currCoordinate = points[i];
            nextCoordinate = points[i+1];
            int x = Math.abs(nextCoordinate[0] - currCoordinate[0]);
            int y = Math.abs(nextCoordinate[1] - currCoordinate[1]);
            totalTime = totalTime + Math.max(x,y);
        }
        return totalTime;
        /*boolean found=false;
        int x=0,y=0;
        int steps=0;
        for(int i =0;i<points.length;i++){
            while(found){
                if (x==points[i][0] && y==points[i][1]){
                    found=true;
                }
                if((x+1==points[i][0] &&y==points[i][1])){
                    found=true;
                    x=x+1;
                    continue;
                }
                if((x==points[i][0] &&y+1==points[i][1])){
                    found=true;
                    y=y+1;
                    continue;
                }
                x++;
                y++;
                steps++;
            }
        }


        return 1;

        */
    }
}
