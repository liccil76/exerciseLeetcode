package divingBoard;

public class Main {
    public static void main(String[] args){
        int[] ints = new Solution().divingBoard(1, 1, 0);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
