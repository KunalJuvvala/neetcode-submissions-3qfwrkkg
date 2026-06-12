class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        mergeSort(nums, 0, nums.length-1);
        int i = 0;
        while(i<=nums.length-2){
            if(i>0 && nums[i]==nums[i-1]){
                i+=1;
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j+=1;
                }else if(sum>0){
                    k-=1;
                }else{
                    List<Integer>temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(k>j && nums[k]==nums[k+1]){
                        k--;
                    }
                    while(j<k && nums[j]==nums[j-1]){
                        j+=1;
                    }
                }
            }
            i+=1;
        }
        return res;
    }
    public void mergeSort(int[] nums, int s, int e){
        if(s>=e){
            return;
        }
        int mid = (s + e)/2;
        mergeSort(nums, s, mid);
        mergeSort(nums, mid+1, e);
        merge(nums, s, mid, e);
    }
    public void merge(int[] nums, int s, int mid, int e){
        List<Integer> temp = new ArrayList<>();
        int i = s;
        int j = mid+1;
        while(i<=mid && j<=e){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i+=1;
            }else{
                temp.add(nums[j]);
                j+=1;
            }
        }
        while(i<=mid){
            temp.add(nums[i]);
            i+=1;
        }
        while(j<=e){
            temp.add(nums[j]);
            j+=1;
        }
        for(int k = 0; k<temp.size();k++){
            nums[s+k] = temp.get(k);
        }
    }
}