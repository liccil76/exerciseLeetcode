package distanceBetweenBusStops;

public class Main {
    public static void main(String[] args){
        int[] distance = {7,10,1,12,11,14,5,0};
        int start = 7;
        int destination = 2;
        int i = new Solution().distanceBetweenBusStops(distance, start, destination);
        System.out.println(i);
    }
}