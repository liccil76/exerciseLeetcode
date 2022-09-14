package mergesortedarray;

public class Solution {
    /**
     * 88.给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     *
     * 说明:
     * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
     * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
     *  
     * 示例:
     * 输入:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * 输出: [1,2,2,3,5,6]
     */

    /**
     * 正序、双指针、临时数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0 ,p2 = 0;
        int[] temp = new int[m+n];
        int cur;
        while(p1<m || p2<n){
            if(p1==m){
                cur = nums2[p2++];
            }else if(p2==n){
                cur = nums1[p1++];
            }else if(nums1[p1] > nums2[p2]){
                cur = nums2[p2++];
            }else{
                cur = nums1[p1++];
            }
            temp[p1+p2-1]=cur;
        }
        //临时数组赋值至nums1
        System.arraycopy(temp, 0, nums1, 0, temp.length);
    }

    /**
     * 逆序 双指针 不适用额外空间
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1,p2 = n-1;
        int tail = m+n-1;
        int cur;
        while (p1 >= 0 || p2 >= 0){
            if(p1==-1){
                cur = nums2[p2--];
            }else if(p2==-1){
                cur = nums1[p1--];
            }else if(nums1[p1]>nums2[p2]){
                cur = nums1[p1--];
            }else{
                cur = nums2[p2--];
            }
            nums1[tail--]=cur;
        }
    }
}
