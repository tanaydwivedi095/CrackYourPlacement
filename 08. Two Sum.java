class Solution {
    public int[] twoSum(int[] nums, int target) {
        // DATA STRUCTURE FOR STORING VALUE AND ALL ITS INDEXES
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new Stack<>());
            }
            map.get(nums[i]).push(i);
        }
        for(int i=0; i<nums.length; i++){
            int secondNum = target - nums[i];
            if(map.containsKey(secondNum)){
                int idx1 = map.get(nums[i]).pop();
                if(!map.get(secondNum).isEmpty()){
                    int idx2 = map.get(secondNum).pop();
                    int[] result = {idx1, idx2};
                    return result;
                }
                else{
                    map.get(nums[i]).push(idx1);
                }
            }
        }
        return new int[2];
    }
}
