class Solution {

    public String encode(List<String> strs) {
        String encoded_str = "";
        for(String str: strs){
            int len = str.length();
            encoded_str = encoded_str+""+len+"#"+str;
        }
        return encoded_str;
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int n = str.length();
        int i = 0;
        while(i < n){
            int hashIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hashIndex));
            ans.add(str.substring(hashIndex + 1, hashIndex + 1 + len));
            i = hashIndex + 1 + len;
        }
        return ans;
    }
}
