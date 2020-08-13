package minTimeToVisitAllPoints;

public class Main {
    public static void main(String[] args){
        int[] a = {3,2};
        int[] b = {-2,2};
        int[][] points = new int[2][2];
        points[0]=a;
        points[1]=b;
        int i = new Solution().minTimeToVisitAllPoints(points);
        System.out.println(i);
    }
}