package verifyPostorder;

public class Solution {
    /**
     * 剑指 Offer 33. 二叉搜索树的后序遍历序列
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
     * 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
     *
     * 参考以下这颗二叉搜索树：
     *      5
     *     / \
     *    2   6
     *   / \
     *  1   3
     * 示例 1：
     * 输入: [1,6,3,2,5]
     * 输出: false
     *
     * 示例 2：
     * 输入: [1,3,2,6,5]
     * 输出: true
     *
     * 提示：
     * 数组长度 <= 1000
     */
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length==0) return true;
        int root = postorder[postorder.length-1];
        boolean findMin = true;
        int index = 0;
        for (int i = 0; i < postorder.length-1; i++) {
            if(findMin){
                if(postorder[i]>root){
                    index=i;
                    findMin=false;
                }
            }else{
                if(postorder[i]<root) return false;
            }
        }
        if(index<=1 && postorder.length-1-index<=1) return true;
        int[] left = new int[index];
        int[] right = new int[postorder.length-1-index];
        System.arraycopy(postorder,0,left,0,left.length);
        System.arraycopy(postorder,index,right,0,right.length);
        return verifyPostorder(left) && verifyPostorder(right);
    }
}
