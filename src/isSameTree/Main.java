package isSameTree;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(1,new TreeNode(2),new TreeNode(1));
        TreeNode b = new TreeNode(1,new TreeNode(1),new TreeNode(2));
        System.out.println(new Solution().isSameTree(a,b));
    }
}
