class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> item = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(item.contains(nums[i]))
            return true;

            item.add(nums[i]);
        }

        return false;
    }
}