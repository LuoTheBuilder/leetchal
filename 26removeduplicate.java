class Solution {
    public int removeDuplicates(int[] nums) {
                int s=0;
        int f=0;
        while (f<=nums.length-1){
            if (nums[s]!=nums[f]){
                nums[s+1]=nums[f];
                s++;
            }
            else if (nums[s]==nums[f]){
                f++;
            }
        }
        return s+1;
    }
    }
