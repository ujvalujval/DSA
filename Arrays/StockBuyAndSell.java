package Arrays;

public class StockBuyAndSell {

    public static int stockbuyandsell(int[] arr) {
        int minprice = Integer.MAX_VALUE, maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minprice)   minprice = arr[i];
            else {
                int profit = arr[i] - minprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; 
        System.out.println(stockbuyandsell(arr));
    }
}
