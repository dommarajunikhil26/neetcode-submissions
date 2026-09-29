class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        List<Integer> temp = new ArrayList<>();
        for(int n : nums){
            if(!set.contains(n-1)){
                temp.add(n);
            }
        }
        int ans = 0;
        for(int i = 0; i < temp.size(); i++){
            int curr = 0;
            int currNum = temp.get(i);
            while(set.contains(currNum)){
                curr++;
                currNum++;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
