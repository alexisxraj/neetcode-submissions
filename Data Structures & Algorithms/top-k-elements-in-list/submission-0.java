class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        int[] res = new int[k];
        int max=-1,max_k=-1;

        for(int i=0;i<nums.length;i++)
        {
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<k;i++){
            max=-1;
            max_k=-1;
            for(Map.Entry<Integer,Integer> entry: count.entrySet()) {
                if(entry.getValue()>max)
                {
                    max = entry.getValue();
                    max_k = entry.getKey();
                }
            }

            res[i]=max_k;
            count.put(max_k,-1); 
        }

        return res;
    }
}
