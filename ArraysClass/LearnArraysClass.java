package ArraysClass;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int arr[] = {1,2,3,56,9,43,23,7};
        System.out.println(arr);
        Arrays.sort(arr);

        System.out.println(arr);

      int search =   Arrays.binarySearch(arr,3); // time complexity O(Nlog)

        System.out.println(search);

        int numAr[] = new int [5];
        Arrays.fill(numAr,3);
        System.out.println(Arrays.toString(numAr));

//        loop

        for(int i : arr){
            System.out.println(i + " ");
        }
    }
}
