package average;

public class Main {
    public static void main(String[] args){
        int[] salary = {8000,9000,2000,3000,6000,1000};
        double average = new Solution().average(salary);
        System.out.println("average:"+average);
    }
}