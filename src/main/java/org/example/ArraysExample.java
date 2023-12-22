package org.example;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
       /* int nums[];
        nums = new int[5];

        int nums1[]=new int[5];
        int[] nums2 = new int[5];

        int num3[] = new int[] {1, 2, 3, 4, 5};
        int[] nums4 = new int[] {1, 45, 566, 6};

        nums2[0] = 12;
        nums2[1] = 3;
        nums2[2] = 45;
        nums2[3] = 9;
        nums2[4] = 99;

        System.out.println(nums2[2]);

        int lengthOfArray = num3.length;
        int langthINdexOfArray = num3[num3.length - 1];
        System.out.println(lengthOfArray);
        System.out.println(langthINdexOfArray);

        for (int i = 0; i<5; i++){
            System.out.println(nums2[i]);
        }

        for (int j:nums2){
            System.out.println(j);
        }
        int[][] nums5 = {{1, 2, 2}, {1, 23, 5}, {67, 6, 5}};
        int[][] nums6 = new int[2][2];
        nums6 [0][0] = 12;

        for (int i = 0; i < nums5.length; i++){
            for (int j = 0; j < nums5.length; j++){
                System.out.println(nums5[i][j]);
            }
        }*/
        int [][] nums7 = new int[3][];
        nums7[0] = new int[5];
        nums7[1] = new int[3];
        nums7[2] = new int[8];
        System.out.println(Arrays.toString(nums7));
    }
}
