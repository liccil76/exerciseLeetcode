package maxDistToClosest;

public class Main {
    public static void main(String[] args){
        int[] seats = {1,0,0,0,1};
        int i = new Solution().maxDistToClosest(seats);
        System.out.println(i);
    }
}