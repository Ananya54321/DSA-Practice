class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int ones = 0;
        int maxlen = 0, len = 0, j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                ones++;
            }
            else{
                zeros++;
                if(zeros>k){
                    while(nums[j]!=0){
                        j++;
                    }
                    j++;
                    zeros--;
                }
            }
            len = i-j+1;
            maxlen = len>maxlen?len:maxlen;
        }
        return maxlen;
    }
}
