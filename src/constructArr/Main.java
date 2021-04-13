package constructArr;

/**
 * @author lichen
 * @since 2021/4/13 19:54
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] ints = new Solution().constructArr(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
