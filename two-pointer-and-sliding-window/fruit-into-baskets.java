class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0, j = 0;
        int len = 0, maxlen = 0;
        for(i = 0; i < fruits.length; i++){
            if(hm.containsKey(fruits[i])){
                hm.put(fruits[i],hm.get(fruits[i])+1);
            }
            else{
                if(hm.size()<2){
                    hm.put(fruits[i],1);
                }
                else{
                    while(hm.size()==2){
                        hm.put(fruits[j], hm.get(fruits[j])-1);
                        if(hm.get(fruits[j])==0) hm.remove(fruits[j]);
                        j++;
                    }
                    hm.put(fruits[i],1);
                }
            }
            len = i-j+1;
            maxlen = len>maxlen?len:maxlen;
        }
        return maxlen;
    }
}
