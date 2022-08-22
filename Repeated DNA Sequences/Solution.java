// Time Complexity: O(n)
// space complexity:O(2* (length of String)/10)
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if(s==null || s.length()==0) return res;
        int st=0;
        int end=9;
        HashMap<String,Integer> map = new HashMap<>();
        while(end<s.length()){
            String temp = s.substring(st,end+1);
            map.put(temp,map.getOrDefault(temp,0) + 1);
            st++;
            end++;
        }
        for(String key : map.keySet()){
           if(map.get(key)>1) res.add(key);
        }
        return res;
    }
    
}
