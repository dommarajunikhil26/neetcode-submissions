class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len; i++){
            if (nums[i] > 0) break;
             if (i > 0 && nums[i] == nums[i - 1]) continue;

            int sum = -1 * (nums[i]);
            int j = i+1;
            int k = len -1;
            while(j < k){
                if((nums[j]+nums[k]) > sum){
                    k--;
                }else if((nums[j]+nums[k]) < sum){
                    j++;
                }else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}
