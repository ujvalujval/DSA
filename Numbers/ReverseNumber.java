package Numbers;

public class ReverseNumber {

    public static int reverseNumber(int number) {
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number = -123;
        System.out.println(reverseNumber(number));
    }
}
