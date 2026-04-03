package sortings;

import java.util.Arrays;

public class MergeSort {

    public static void mSort(int[] arr, int start,int mid, int end){
        
        int[] newArr = new int[arr.length];
         mid = (start+end)/2;
        int i = start, j = mid, k = start;
        while (i<mid && j<end) {
            if(arr[i] < arr[j]) newArr[k++] = arr[i++];
            else newArr[k++] = arr[j++];
        }
        while(i<mid) newArr[k++] = arr[i++];
        while(j<end) newArr[k++] = arr[j++];
        for(int it = start;it<end;it++) arr[it] = newArr[it];
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(end-start == 1) return;
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        mSort(arr, start,mid, end);
    }

    public static void main(String[] args) {
        int[] arr = {5,9,2,3,17,11,0};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}