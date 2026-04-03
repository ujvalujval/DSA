public class LinearSearch{

    public static int search(int[] arr, int target){
        int index  = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]== target){
                index = i;
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 15;
        System.out.println(search(arr, target));
    }
}