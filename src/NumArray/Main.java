package NumArray;

public class Main {

    public static void main(String[] args){
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        int i = numArray.sumRange(0, 5);
        System.out.println(i);
    }

}
