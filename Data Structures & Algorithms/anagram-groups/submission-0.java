class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int count[] = new int[26];
            for(int i = 0; i<s.length(); i++){
                count[s.charAt(i)-'a']+=1;
            }
            String key = Arrays.toString(count);
            if(map.containsKey(key)){
                List<String> temp = map.get(key);
                temp.add(s);
                map.put(key,temp);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(key,temp);
            }
        }
        for(Map.Entry<String,List<String>>e:map.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}