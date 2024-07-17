class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int num: nums){
            if(visited.contains(num)){
                result.add(num);
            }
            visited.add(num);
        }
        return result;
    }
}
