package sortedArrayToBST;

public class Main {
    public static void main(String[] args){
        int[] nums = {-10,-3,0,5,9};
        TreeNode treeNode = new Solution().sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
