class Solution {
    public int maxArea(int[] height) {
        int lPtr = 0;
        int rPtr = height.length-1;
        int maxArea = 0;
        while(lPtr<rPtr){
            maxArea = Math.max(maxArea, Math.min(height[lPtr], height[rPtr])*(rPtr-lPtr));
            if(height[lPtr]<height[rPtr]){
                lPtr++;
            }
            else{
                rPtr--;
            }
        }
        return maxArea;
    }
}
