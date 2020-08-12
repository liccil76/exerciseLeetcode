package pathSum;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(5);

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(8);
        a.left=b;
        a.right=c;

        TreeNode d = new TreeNode(11);
        TreeNode e = new TreeNode(13);
        TreeNode f = new TreeNode(4);
        b.left=d;
        c.left=e;
        c.right=f;

        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(2);
        TreeNode i = new TreeNode(5);
        TreeNode j = new TreeNode(1);
        d.left=g;
        d.right=h;
        e.left=i;
        e.right=j;

        System.out.println(new Solution().pathSum(a,22));
    }
}
