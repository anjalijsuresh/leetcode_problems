class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length && nums[i]<=100;i++){
            if(nums[i]==nums[i-1]){
                nums[i]=999;
                count++;
                i=i-1;
            }
            Arrays.sort(nums);
        }
        count=nums.length-count;
        return(count);
    }
}
