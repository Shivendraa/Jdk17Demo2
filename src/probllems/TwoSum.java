package probllems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum {
    //Problem
    //Given array of integers,
    //Return indices of 2 numbers, such that they add up to a specific target
    //You may assume, there is exact one solution
    // Numbers - 1, 8, 11, 28, 7
    // Target - 15
    // Result - [1, 4]

    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) throws IOException {

    }
}
