package replaceElements;

public class Main {
    public static void main(String[] args){
        int[] arr = {17,18,5,4,6,1};
        int[] ints = new Solution().replaceElements(arr);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}