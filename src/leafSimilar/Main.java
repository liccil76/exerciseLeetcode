package leafSimilar;

public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(119);

        TreeNode b = new TreeNode(113);
        a.left=b;

        TreeNode c = new TreeNode(11);
        TreeNode d = new TreeNode(30);
        b.left=c;
        b.right=d;

        TreeNode e = new TreeNode(43);
        TreeNode f = new TreeNode(76);
        TreeNode g = new TreeNode(15);
        TreeNode h = new TreeNode(60);
        c.left=e;
        c.right=f;
        d.left=g;
        d.right=h;

        TreeNode i = new TreeNode(67);
        TreeNode j = new TreeNode(74);
        e.left=i;
        e.right=j;

        TreeNode a1 = new TreeNode(11);

        TreeNode b1 = new TreeNode(69);
        TreeNode c1 = new TreeNode(60);
        a1.left=b1;
        a1.right=c1;

        TreeNode d1 = new TreeNode(115);
        TreeNode e1 = new TreeNode(66);
        TreeNode f1 = new TreeNode(15);
        TreeNode g1 = new TreeNode(60);
        b1.left=d1;
        b1.right=e1;
        c1.left=f1;
        c1.right=g1;

        TreeNode h1 = new TreeNode(60);
        TreeNode i1 = new TreeNode(74);
        TreeNode j1 = new TreeNode(76);
        d1.left=h1;
        d1.right=i1;
        e1.right=j1;

        boolean result = new Solution().leafSimilar(a,a1);
        System.out.println(result);
    }
}
