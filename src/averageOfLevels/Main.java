package averageOfLevels;

import java.util.List;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(2147483647);

        TreeNode b = new TreeNode(2147483647);
        TreeNode c = new TreeNode(2147483647);
        a.left=b;
        a.right=c;

        List<Double> doubles = new Solution().averageOfLevels(a);
    }
}
