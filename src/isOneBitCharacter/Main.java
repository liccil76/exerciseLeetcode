package isOneBitCharacter;

public class Main {
    public static void main(String[] args){
        int[] bits = {1, 0, 0};
        boolean oneBitCharacter = new Solution().isOneBitCharacter(bits);
        System.out.println(oneBitCharacter);
    }
}