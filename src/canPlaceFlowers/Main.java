package canPlaceFlowers;

public class Main {
    public static void main(String[] args){
        int[] flowerbed = {0};
        int n = 0;
        boolean b = new Solution().canPlaceFlowers(flowerbed, n);
        System.out.println(b);
    }
}