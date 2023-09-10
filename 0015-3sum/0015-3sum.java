class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //important question pls do again
        Set<List<Integer>> sets = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                    
                    int target=0-nums[i]-nums[j];
                    if(set.contains(target)){
                        List<Integer> combination = new ArrayList<>(Arrays.asList(nums[i], nums[j],target));
                        Collections.sort(combination);
                        sets.add(combination);
                    }
                    set.add(nums[j]);
            }
            set.clear();
        }
        List<List<Integer>> res = new ArrayList<>(sets);
        return res;
    }

}