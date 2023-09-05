class Solution {
    public int[] sortedSquares(int[] nums) {
        int indexTillNeg=0;
        ArrayList<Integer> arrlist = new ArrayList<Integer>(nums.length);
        for(int index=0;index<nums.length;index++){
            if(nums[index]>=0){arrlist.add(nums[index]);}
            else indexTillNeg=index;
        }

        int posIndex=0;
        boolean fullNeg=false;
        if(indexTillNeg==nums.length-1)fullNeg=true;
        while(indexTillNeg>=0 && posIndex<nums.length && arrlist.size()!=nums.length){
            if(arrlist.size()-1==posIndex){
                int val=nums[indexTillNeg]*-1;
                if(val<=arrlist.get(posIndex)){
                    arrlist.add(posIndex,val);
                    indexTillNeg--;
                }
                else arrlist.add(nums[indexTillNeg--]);posIndex++;
            }
            else if(fullNeg){
                int val=nums[indexTillNeg]*-1;
                System.out.println(val);
                arrlist.add(posIndex,val);
                indexTillNeg--;posIndex++;
            }else{
                int val=nums[indexTillNeg]*-1;
                if(val<=arrlist.get(posIndex)){
                    arrlist.add(posIndex,val);
                    indexTillNeg--;
                }
                else if(val>=arrlist.get(posIndex) && val<=arrlist.get(posIndex+1)){
                    arrlist.add(posIndex+1,val);
                    indexTillNeg--;posIndex++;
                }else{
                    posIndex++;
                }
            }
        }

        for(int index=0;index<nums.length;index++){
            nums[index]=arrlist.get(index) * arrlist.get(index);
        }
        return nums;

    }
}