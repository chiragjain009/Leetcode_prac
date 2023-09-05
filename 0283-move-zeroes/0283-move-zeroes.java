class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex=0;
        int countZero=0;
        for(int index=0;index<nums.length;index++){
            // if(nums[index]!=0)nums[nonZeroIndex++]=nums[index];
            // else countZero++;
            if(nums[index]!=0){
                int temp=nums[index];
                nums[index]=nums[nonZeroIndex];
                nums[nonZeroIndex++]=temp;
            }
        }
        // int index=nums.length-1;
        // while(countZero!=0){nums[index--]=0;countZero--;}

    }
}