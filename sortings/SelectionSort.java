package sortings;

public class SelectionSort {

    public static int[] sorting(int[] arr){

        for(int i = 0;i<arr.length-1;i++){
            int index = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[index] > arr[j])
                    index = j;
            }
            if(i != index){
                arr[i] = arr[i]^arr[index];
                arr[index] = arr[i]^arr[index];
                arr[i] = arr[i]^arr[index];
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
        int[] arr = {5,9,2,3,17,11};
        display(arr);
        sorting(arr);
        display(arr);
    }
}
