package commonChars;

import java.util.List;

public class Main {
    public static void main(String[] args){
        String[] A = {"bella","label","roller"};
        List<String> strings = new Solution().commonChars(A);
        for (String string : strings) {
            System.out.print(string+" ");
        }
    }
}