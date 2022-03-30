package isAnagram;

/**
 * @author lichen
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (byte aByte : s.getBytes()) {
            arr[aByte-97]++;
        }
        for (byte aByte : t.getBytes()) {
            arr[aByte-97]--;
        }
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
