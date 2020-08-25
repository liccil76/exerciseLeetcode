package busyStudent;

public class Main {
    public static void main(String[] args){
        int[] startTime = {9,8,7,6,5,4,3,2,1},endTime={10,10,10,10,10,10,10,10,10};
        int queryTime = 5;
        int i = new Solution().busyStudent(startTime, endTime, queryTime);
        System.out.println(i);
    }
}