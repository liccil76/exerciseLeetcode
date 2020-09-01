package kidsWithCandies;

import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> list = new Solution().kidsWithCandies(candies, extraCandies);
        for (Boolean aBoolean : list) {
            System.out.print(aBoolean+" ");
        }
    }
}