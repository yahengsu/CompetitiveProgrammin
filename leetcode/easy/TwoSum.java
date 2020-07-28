class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                a[0] = i;
                a[1] = map.get(diff);
            }
            else {
                map.put(nums[i], i);
            }
        }
        return a;
    }
}