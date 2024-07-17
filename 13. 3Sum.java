class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int idx = 0; idx < nums.length - 2; idx++) {
            int lPtr = idx + 1;
            int rPtr = nums.length - 1;
            while (lPtr < rPtr) {
                int sum = nums[lPtr] + nums[rPtr] + nums[idx];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[idx], nums[lPtr], nums[rPtr]));
                }
                if (sum <= 0) {
                    lPtr++;
                } else {
                    rPtr--;
                }
            }
        }
        result.addAll(set);
        return result;
    }
}
