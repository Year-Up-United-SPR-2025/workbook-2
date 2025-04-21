package com.pluralsight;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        //            0   1    2   3   4  5    6   7

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();

        String[] strings = {"one", "two", "orange", "red", "left", "right"};
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        int[] nums2 = new int[5];
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        String[] nameList = {
                "Natalie", "Brittany", "Zachary", "Ezra", "Ian",
                "Siddalee", "Elisha", "Pursalane", "Zephaniah"
        };
        Arrays.sort(nameList);
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}

