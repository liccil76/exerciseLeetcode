package sumZero;

public class Main {
    public static void main(String[] args){
        int n =1;
        int[] ints = new Solution().sumZero(n);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}