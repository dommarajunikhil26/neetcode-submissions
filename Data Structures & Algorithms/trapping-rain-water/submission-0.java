class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if(len == 0 ){
            return 0;
        }
        int l = 0; 
        int r = len -1;
        int leftMax = height[l];
        int rightMax = height[r];
        int ans = 0;
        while(l < r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                ans += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                ans += rightMax - height[r];
            }
        }
        return ans;
    }
}
