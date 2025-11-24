package com.cstradic.bitmanipulation;

public class SingleNumberThree {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];

        int result = 0;
        for(int num: nums) {
                result = result ^ num;
        }
        int freqBit = Integer.highestOneBit(result);
        for(int num: nums) {
            if((num&freqBit) ==  freqBit){
                ans[0] = ans[0] ^ num;
            }
        }
        ans[1] = result^ans[0];
        return ans;
    }
}
