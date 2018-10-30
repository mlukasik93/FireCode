public class Ex6 {
    public static void main(String[] args) {
        int[] test = {2};
        System.out.println(binarySearch(test,2));
    }
    public static Boolean binarySearch(int[] arr, int n){
        boolean result=false;
        for(int i =0;i<=arr.length-1 ; i++){
            if(arr[i]==n){
                result=true;
            }
        }
        return result;
    }
}
