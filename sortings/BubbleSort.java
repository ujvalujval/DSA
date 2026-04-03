package sortings;

public class BubbleSort {

    public static int[] sorting(int[] arr){

        for(int i= 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                }
            }
        }
        return arr;
    }

    public static void display(int[] arr){
        for(int val : arr)
                System.out.print(val+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={5,9,2,3,17,11};
        display(arr);
        sorting(arr);
        display(arr);
    }
}
