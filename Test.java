package com.happycoding.problems.binarySearch;

public class Test {
    public int search(int[] nums, int target) {
        int first = 0;
        int last  = nums.length-1;
        while(first <= last){
            int middle = first + (last-first) / 2 ;
            if(nums[middle] == target){
                return middle;
            }
            else if (target > nums[middle]){
                first = middle+1;
            }
            else if (target < nums[middle]){
                last = middle-1;
            }
        }
        return -1;
    }
}
