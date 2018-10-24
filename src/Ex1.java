import static java.lang.Math.abs;
import static java.lang.Math.cbrt;

public class Ex1 {

    static int[] arr = {6,7,8,9,10,1,2,3,5};

    public static void main(String[] args) {
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i+1 < arr.length; i++) {
            switch (arr[firstNumber] - arr[secondNumber]) {
                case 8:
                    return 1;
                case -2:
                    return arr[firstNumber]+1;
                default:
                    firstNumber++;
                    secondNumber++;
            }
        }
        return 0;
    }
}