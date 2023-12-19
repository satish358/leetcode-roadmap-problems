package com.cstradic.arrays;

import java.util.HashMap;
import java.util.Map;
/*
Link : https://leetcode.com/problems/contains-duplicate/
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> vector = new HashMap<>();
        for(var num: nums){
            if(vector.containsKey(num)) return true;
            vector.put(num, true);
        }
        return false;
    }
}
