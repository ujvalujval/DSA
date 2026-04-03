public class BinarySearch {

    public static int search(int[] arr, int target){
        int index = -1;
        int left = 0, right = arr.length-1;
        while (left<=right) {
            // int mid = (left+right)/2;
            int mid = left +(right-left)/2;
            if(arr[mid] == target){
                index = mid;
                return mid;
            }else if(arr[mid] < target)
                left = mid +1;
            else right = mid - 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        System.out.println(search(arr, target));
    }
}
