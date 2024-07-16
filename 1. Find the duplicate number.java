class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int setSum = 0;
        int fullSum = 0;
        for(int num: nums){
            numSet.add(num);
            fullSum += num;
        }
        for(int num: numSet){
            setSum += num;
        }
        return (fullSum-setSum)/(nums.length-numSet.size());
    }
}
