package intersect;

public class Main {
    public static void main(String[] args){
        int[] nums1 = {-2147483648,1,2,3};
        int[] nums2 = {1,-2147483648,-2147483648};
        int[] intersect = new Solution().intersect(nums1, nums2);
        for (int i = 0; i < intersect.length; i++) {
            System.out.print(intersect[i] + " ");
        }
    }
}
