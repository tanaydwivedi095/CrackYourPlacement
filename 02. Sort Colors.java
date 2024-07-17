class Solution {
    public void sortColors(int[] nums) {
        int lPtr = 0;
        int mid = 0;
        int rPtr = nums.length-1;
        while(mid<=rPtr){
            if(nums[mid]==0){
                int temp = nums[lPtr];
                nums[lPtr] = nums[mid];
                nums[mid] = temp;
                lPtr++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[rPtr];
                nums[rPtr] = nums[mid];
                nums[mid] = temp;
                rPtr--;
            }
        }
    }
        
}
