class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*int i = 0;
        int j = nums.length-1;
        // Arrays.sort(res);
        while(i<j){
            if(nums[i]<0 && nums[j]<0){
            if(nums[i]+nums[j]==target){
                res[0] = i;
                res[1] = j;
                return res;
            }else if(nums[i]+nums[j]>target){
                i++;
            }else if(nums[i]+nums[j]<target){
                j--;
            }    
            }else{
            if(nums[i]+nums[j]==target){
                res[0] = i;
                res[1] = j;
                return res;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else if(nums[i]+nums[j]>target){
                j--;
            }
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(map.containsKey(target-e.getKey())){
                if(map.get(target-e.getKey())!=e.getValue())
                {
                    int tempIndex = map.get(target-e.getKey());
                    res[0] = Math.min(e.getValue(),tempIndex);
                    res[1] = Math.max(e.getValue(),tempIndex);
                    return res;
                }
            }
        }*/

        HashMap<Integer,Integer> index = new HashMap<>();
        HashMap<Integer,Integer> freq= new HashMap<>();
        int []res = new int[2];
        for(int i =0;i< nums.length;i++){
            index.put(nums[i], i);
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }else{
                freq.put(nums[i],1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            int a = nums[i];
            int b = target - nums[i];
            if(freq.containsKey(b)){
                if(a==b){
                    if(freq.get(a)>1){
                    res[0] = i;
                    res[1] = index.get(b);
                    break;
                    }
                }else{
                    res[0] = i;
                    res[1] = index.get(b);
                    break;
                }
            }
        }
        return res;
    }
}