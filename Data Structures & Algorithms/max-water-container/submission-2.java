class Solution {
    public int maxArea(int[] heights) {
        return findMax(heights,0,heights.length-1);
    }
    public static int findMax(int[] nums, int i, int j){
        if(i==j || i<0 || j>nums.length-1){
            return 0;
        }
        int area = (Math.min(nums[i],nums[j]))*(j-i);
        int max = -1;
        if(nums[i]>nums[j]){
            max = Math.max(area,findMax(nums, i, j-1));
            j-=1;
        }else{
            max = Math.max(area,findMax(nums, i+1, j));
            i+=1;
        }
        return Math.max(area, max);
    }
}