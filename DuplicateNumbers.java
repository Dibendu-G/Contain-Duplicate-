package com.company;
import java.util.*;
class Solution {
    Scanner s = new Scanner(System.in);
    int [] nums ={4,5,8,9,6,6};
    public boolean containsDuplicate() {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}
public class DuplicateNumbers {
    public static void main(String[] args) {
        Solution sc = new Solution();
        System.out.println(sc.containsDuplicate());
    }
}
