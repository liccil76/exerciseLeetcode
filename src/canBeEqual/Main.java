package canBeEqual;

public class Main {
    public static void main(String[] args){
        int[] target = {3,7,9};
        int[] arr = {3,7,11};
        System.out.println(new Solution().canBeEqual(target,arr));
    }
}