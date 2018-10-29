public class Ex3 {

    public static void main(String[] args) {
        int[] A = {1,1,1,1,1,2,3,4,4,3};
        System.out.println(singleNumber(A));
    }

    public static int singleNumber(int[] A) {
        int temp = 0;
        int number = 0;
        for (int i=0 ; i< A.length&&temp!=1;i++) {
            temp =0;
            for (int j=0 ;j< A.length;j++) {
                if (A[i] == A[j]){
                    temp++;
                }
            }
            number=A[i];
        }
        return number;
    }
}
