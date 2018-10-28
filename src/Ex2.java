public class Ex2 {
    public static void main(String[] args) {
        int [] matrix = {1,5,9,7};
        flipItVerticalAxis(matrix);
    }


    public static void flipItVerticalAxis(int[] matrix) {
           for (int i=0; i<matrix.length;i++){
               matrix[i]=matrix[matrix.length-1-i];
               System.out.print(matrix[i]+", ");
           }
    }
}