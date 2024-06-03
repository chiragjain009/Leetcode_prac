class Solution { int maxi=0;
    public int longestConsecutive(int[] nums) {
       if(nums.length==0)return 0;
        //for(int i=0;i<nums.length;i++)longest(nums,nums[i]+1,1);
        Arrays.sort(nums);
        int max = 1;
        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            int count = 1;
            int j = i;
            //find continue
            while(true){
                if(( j+1 < nums.length ) && (nums[j+1]==num)) {
                    j++;
                    continue;
                }

                if( ( j+1 < nums.length ) &&( nums[++j] == ++num ) ){
                    count++;
                    max = Math.max(count,max);
                    i=j;
                }else break;
            }
        }
        return max;
    }
    // public int longest(int[] nums,int val,int res){
       
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==val)longest(nums,val+1,res+1);
    //     }
    //     maxi=Math.max(res,maxi);
    //     return res;
    // }
}