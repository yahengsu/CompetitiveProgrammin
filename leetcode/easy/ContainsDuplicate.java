class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(a.containsKey(nums[i]))
                return true;
            else
                a.put(nums[i], nums[i]);
        }
        return false;
    }
}