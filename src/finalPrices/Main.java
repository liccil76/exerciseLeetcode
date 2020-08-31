package finalPrices;

public class Main {
    public static void main(String[] args){
        int[] prices = {8,7,4,2,8,1,7,7,10,1};
        int[] ints = new Solution().finalPrices(prices);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}