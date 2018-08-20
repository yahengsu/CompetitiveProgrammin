package leetcode.easy;

import java.util.*;
import java.io.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> n = new HashMap<>(nums.length);
        int[] ind = new int[2];
        for (int i = 0; i < nums.length; i++) {
            n.put(target-nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (n.containsKey(nums[i]) && i != n.get(nums[i])) {
                ind[0] = i;
                ind[1] = n.get(nums[i]);
                return ind;
            }
        }
        return null;
    }
}