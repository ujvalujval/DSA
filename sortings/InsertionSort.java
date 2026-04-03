package sortings;

public class InsertionSort {

    public static int[] sorting(int[] arr){
        for(int i= 1;i<arr.length;i++){
            int key = arr[i];
            int j= i-1;
            while (j >=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void display(int[] arr){
        for(int val : arr)
            System.out.print(val+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,9,2,3,17,11};
        display(arr);
        sorting(arr);
        display(arr);
    }
}
