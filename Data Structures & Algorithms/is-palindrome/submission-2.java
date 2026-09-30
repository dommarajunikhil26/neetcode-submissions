class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if(len == 0 || len == 1) return true;
        String str = s.toLowerCase();
        String str2 = "";
        for(int i = 0; i < len; i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                str2 += str.charAt(i);
            }
        }
        int i = 0;
        int j = str2.length()-1;
        while(i<=j){
            if(str2.charAt(i) != str2.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
