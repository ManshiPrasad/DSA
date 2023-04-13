package Java;

public class newleet {
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int max = 1001;
        for(int i=n; i<nums.length; i++){
            nums[i] = max*nums[i]+nums[i-n];
        }
        int index =0;
        for(int i = n; i<nums.length;i++){
            nums[index] = nums[i]%max;
            nums[index+1] = nums[i]/max;
        }
        return nums;
    }
}