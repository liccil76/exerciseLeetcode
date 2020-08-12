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
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int one = 0;
        int two = 0;
        int[] temp = new int[m];
        System.arraycopy(nums1,0,temp,0,m);
        for (int i = 0; i < nums1.length; i++) {
            if(one>=m){
                //nums1已经轮询完
                if(two<n){
                    nums1[i]=nums2[two];
                    two++;
                }
            }else{
                if(two>=n){
                    //nums2已经轮询完
                    nums1[i]=temp[one];
                    one++;
                }else{
                    if(temp[one]<nums2[two]){
                        nums1[i]=temp[one];
                        one++;
                    }else if(temp[one]>nums2[two]){
                        nums1[i]=nums2[two];
                        two++;
                    }else if(temp[one]==nums2[two]){
                        nums1[i]=temp[one];
                        one++;
                    }
                }
            }
        }
    }
}
