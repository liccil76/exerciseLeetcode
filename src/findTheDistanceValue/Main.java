package findTheDistanceValue;

public class Main {
    public static void main(String[] args){
        int[] arr1={1,4,2,3};
        int[] arr2={-4,-3,6,10,20,30};
        int d=3;
        int theDistanceValue = new Solution().findTheDistanceValue2(arr1, arr2, d);
        System.out.println(theDistanceValue);
    }
}