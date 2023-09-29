class Solution {
    int count=0;
    public int subarraySum(int[] nums, int k) {
        subarray(nums,k,0);
        return count;
    }

    public void subarray(int[] nums,int k,int start){
       if(start==nums.length)return;
        int target=0;
        for(int i=start;i<nums.length;i++){
           target=target+nums[i];
            if(target==k)count++;
           
        }
        subarray(nums,k,start+1);
        return;

    }
}