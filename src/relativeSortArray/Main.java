package relativeSortArray;

public class Main {
    public static void main(String[] args){
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19},arr2={2,1,4,3,9,6};
        int[] ints = new Solution().relativeSortArray2(arr1, arr2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints["+i+"]="+ints[i]);
        }
    }
}