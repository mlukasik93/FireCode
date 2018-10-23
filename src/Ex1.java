import static java.lang.Math.abs;

public class Ex1 {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int firstNumber = 0;
        int secondNumber = firstNumber + 1;
        while ((arr[firstNumber] - arr[secondNumber]) == abs(1)) {
            firstNumber++;
        }
        return secondNumber;

    }
}