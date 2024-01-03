package com.cstradic.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    //FIRST CASE
    int[] arr1 = new int[]{2,7,11,15};
    int target1 = 9;
    int[] result1 =new  int[]{0,1};
   // SECOND CASE
    int[] arr2 = new int[]{3,2,4};
    int target2 = 6;
    int[] result2 =new  int[]{1,2};

    // THIRD CASE
    int[] arr3 = new int[]{3,3};
    int target3 = 6;
    int[] result3 =new  int[]{0,1};



    @Test
    void twoSumFirstCase() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(arr1,target1),result1 );
    }
    @Test
    void twoSumTwoCase() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(arr2,target2),result2 );
    }
    @Test
    void twoSumThreeCase() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(arr3,target3),result3 );
    }
}