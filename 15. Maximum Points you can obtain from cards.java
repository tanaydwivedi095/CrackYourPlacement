class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int currSum = 0;
        int lPtr = k-1;
        int rPtr = cardPoints.length-1;
        int maxSum = 0;
        for(int i=0; i<k; i++){
            currSum += cardPoints[i];
        }
        maxSum = currSum;
        while(lPtr>-1){
            currSum = currSum - cardPoints[lPtr--] + cardPoints[rPtr--];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
