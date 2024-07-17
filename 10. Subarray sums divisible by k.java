class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum = (sum+arr[i])%k;
            if(sum<0) sum+=k;
            ans += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
