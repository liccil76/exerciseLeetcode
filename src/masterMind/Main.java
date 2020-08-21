package masterMind;

public class Main {
    public static void main(String[] args){
        String solution = "RGBY";
        String guess = "GGRR";
        int[] ints = new Solution().masterMind(solution, guess);
        System.out.println(ints[0]+","+ints[1]);
    }
}