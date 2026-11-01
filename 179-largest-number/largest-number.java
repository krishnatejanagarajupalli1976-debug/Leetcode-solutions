import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for(int j = i + 1; j < n; j++) {

                int a = nums[maxIndex];
                int b = nums[j];

                String first = "" + a + b;
                String second = "" + b + a;

                if(first.compareTo(second) < 0) {
                    maxIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        // Handle all zeros
        if(nums[0] == 0) {
            return "0";
        }

        String result = "";

        for(int i = 0; i < n; i++) {
            result = result + nums[i];
        }

        return result;
    }
}