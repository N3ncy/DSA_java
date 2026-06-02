package Array;

public class Subarr {
    public static void subarr(int[] arr, int start, int end){
        
       for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
       }
       System.out.println();
    }
    public static void allSubarr(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                subarr(arr, i, j);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        allSubarr(arr, n);
        
    }
}
