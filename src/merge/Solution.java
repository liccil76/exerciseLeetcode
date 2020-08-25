package merge;

public class Solution {
    /**
     * 面试题 10.01. 合并排序的数组
     * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
     * 初始化 A 和 B 的元素数量分别为 m 和 n。
     *
     * 示例:
     * 输入:
     * A = [1,2,3,0,0,0], m = 3
     * B = [2,5,6],       n = 3
     * 输出: [1,2,2,3,5,6]
     *
     * 说明:
     * A.length == n + m
     */
    public void merge(int[] A, int m, int[] B, int n) {
        //正向双指针
        if(B!=null && n>0){
            int[] temp = new int[m];
            System.arraycopy(A,0,temp,0,m);
            int a=0,b=0;
            for (int i = 0; i < A.length; i++) {
                if(b>=n || (a<=m-1 && temp[a]<=B[b])){
                    A[i]=temp[a];
                    a++;
                }else{
                    //temp[a]>B[b];
                    A[i]=B[b];
                    b++;
                }
            }
        }
    }
    public void merge2(int[] A, int m, int[] B, int n) {
        //逆向双指针
        int a=m-1,b=n-1;
        int tail=m+n-1;
        int val;
        while(a>=0 || b>=0){
            if(a==-1) val=B[b--];
            else if(b==-1) val=A[a--];
            else if(A[a]>B[b]) val=A[a--];
            else val=B[b--];
            A[tail--]=val;
        }
    }
}