class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int red = 0;
        int blue = 0;
        int white = 0;

        while (i < n) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 1) {
                white++;
            } else if (nums[i] == 2) {
                blue++;
            }
            i++;
        }

        int k = 0;

        while (red > 0) {
            nums[k] = 0;
            red--;
            k++;
        }

        while (white > 0) {
            nums[k] = 1;
            white--;
            k++;
        }

        while (blue > 0) {
            nums[k] = 2;
            blue--;
            k++;
        }
    }
}
