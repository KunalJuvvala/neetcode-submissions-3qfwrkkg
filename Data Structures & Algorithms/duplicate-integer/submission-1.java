class Solution {
    /*
    public static void merge(int[] arr, int s, int e){
        if(s==e){
            return;
        }
        int mid =(s+e)/2;
        merge(arr,s,mid);
        merge(arr, mid+1, e);
        mergeSort(arr, s, mid, e);
    }

    public static void mergeSort(int[] arr, int s, int mid, int e){
        int left = s;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<right){
            if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                right++;
            }else{
                temp.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=e){
            temp.add(arr[right]);
            right++;
        }
        for(int i = s; i<=e;i++){
            arr[i] = temp.get(i-s);
        }
    }
*/
    public boolean hasDuplicate(int[] nums) {
        /*if(nums.length<=1){
            return false;
        }
        int i = 0;
        int j = 1;
        while(i<j && j<nums.length){
            if(nums[i] == nums[j]){
                return true;
            }
        }
        return false;*/
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}