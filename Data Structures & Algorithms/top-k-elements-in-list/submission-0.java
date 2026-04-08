class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[k];
        for(int i: nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        /*int[] temp = hm.values();
        Arrays.sort(temp);*/
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(hm.entrySet());
        Collections.sort(entries, (a,b) -> b.getValue() - a.getValue());
        for(int i = 0; i < k; i++){
            res[i] = entries.get(i).getKey();
        }
        /*for(Map.Entry<Integer, Integer>e: entries){
            while(k>0) {
                if(e.getValue()==res[k-1]){
                    res[--k] = e.getKey();
                    break;
                }
            }
        }*/
        return res;
    }
}