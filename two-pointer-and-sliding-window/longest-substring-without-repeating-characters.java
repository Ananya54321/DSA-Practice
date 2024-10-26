class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxlen = 0;
        int len = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,i);
            }
            else{
                if(j<=hm.get(ch)){
                   while(s.charAt(j)!=ch){
                        j++;
                    } 
                    j++;
                }
                hm.put(ch,i);
            }
            len = i-j+1;
            maxlen = Math.max(len,maxlen);
        }
        return maxlen;
    }
}
