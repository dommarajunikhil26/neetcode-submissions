class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        if(len == 1) return 1;
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        for(char ch : set){
            int count = 0;
            int p1 = 0;
            for (int p2 = 0; p2 < len; p2++){
                if(s.charAt(p2) == ch){
                    count++;
                }
                while((p2 - p1 + 1) - count > k){
                    if(s.charAt(p1) == ch){
                        count--;
                    }
                    p1++;
                }
                res = Math.max(res, p2-p1+1);
            }
        }
        return res;
    }
}
