package sortings;

import java.util.Arrays;

public class MergeSingleSortedArray {

    public static void mSort(int[] arr, int start,int mid,int end){
        int[] newArr = new int[arr.length];
         mid = (start+end)/2;
        int i = start, j = mid, k = start;
        while (i<mid && j<end) {
            if(arr[i] < arr[j]){
                newArr[k++] = arr[i++];
            }else newArr[k++] = arr[j++];
        }

        while(i<mid){
            newArr[k++] = arr[i++];
        }
        while(j<end){
            newArr[k++] = arr[j++];
        }

        for(int it = 0;it<arr.length;it++){
            arr[it] = newArr[it];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,1,2,3,5};
        int mid = arr.length/2;
        mSort(arr, 0,mid, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
