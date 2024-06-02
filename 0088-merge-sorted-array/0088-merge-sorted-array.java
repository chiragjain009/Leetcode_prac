class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)return;
        
        int lastIndex = nums1.length - 1;
        int l = m -1;
        int r = n - 1;
        while(l>=0 && r>=0){
            int n1 = nums1[l];
            int n2 = nums2[r];

            if(n1>=n2) {
                nums1[lastIndex--] = n1;
                l--;
            }else{
                nums1[lastIndex--] = n2;
                r--;
            }
        }

        while(l>=0){
            int n1 = nums1[l];
            nums1[lastIndex--] = n1;
            l--;
        }
        while(r>=0){
            int n2 = nums2[r];
            nums1[lastIndex--] = n2;
            r--;
        }
    }
}