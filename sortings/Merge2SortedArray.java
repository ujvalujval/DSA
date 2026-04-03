package sortings;

import java.util.Arrays;

public class Merge2SortedArray {

    public static int[] mSort(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k= 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }else arr[k++] = arr2[j++];
        }

        while(i< arr1.length){
            arr[k++] = arr1[i++];
        }

        while (j<arr2.length) {
            arr[k++] = arr2[j++];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,5};
        System.out.println(Arrays.toString(mSort(arr1, arr2)));

    }
}
