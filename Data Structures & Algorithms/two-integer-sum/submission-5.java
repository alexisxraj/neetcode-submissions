class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int pair=-1,p1=-1,p2=-1;

        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i])){
                int v=count.get(nums[i]);
                count.put(nums[i],v+1);
            }
            else
            count.put(nums[i],1);
        }

        for(int i=0;i<nums.length;i++){
            if(count.containsKey(target-nums[i]))
            {
                if(target-nums[i]==nums[i] && count.get(nums[i])==1)
                continue;

                pair=target-nums[i];
                p1=i;
                break;
            }
        }

        for(int i=p1+1;i<nums.length;i++)
        {
            if(nums[i]==pair)
            p2=i;
        }

        return new int[]{p1,p2};
    }
}
