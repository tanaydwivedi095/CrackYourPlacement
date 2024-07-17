class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int a=0; a<nums.length-3; a++){
            for(int b=a+1; b<nums.length-2; b++){
                int c = b+1;
                int d = nums.length-1;
                while(c<d){
                    long sum = (long)nums[a] + (long)nums[b] + (long)nums[c] + (long)nums[d];
                    if(sum==target){
                        set.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        d--;
                    }
                    else if(sum<target){
                        c++;
                    }
                    else{
                        d--;
                    }
                }
            }
        }
        result.addAll(set);
        return result;
    }
}
