class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int p1 = 0;
        int p2 = len -1;
        int area = 0;
        while(p1 < p2){
            int currArea = (p2 - p1) * Math.min(heights[p1], heights[p2]);
            area = Math.max(area, currArea);
            if(heights[p1] < heights[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return area;
    }
}
