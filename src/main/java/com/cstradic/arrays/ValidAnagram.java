package com.cstradic.arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch-97]++;
        };
        for(char ch : t.toCharArray()) {
            if((--arr[ch-97]) < 0) {
                return false;
            }
        }
        return true;
    }

}
