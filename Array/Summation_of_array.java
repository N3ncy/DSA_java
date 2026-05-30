//Given two array of similar size , run a single loop and return a array which is summation of same index element(0 <= element < 5)
package Array;
import java.util.Arrays;

public class Summation_of_array {
    public static int[] SumOfSameidx(int[] arr1, int[] arr2, int n){
        int[] new_arr = new int[n];
        for(int i = 0; i < n; i++){
            new_arr[i] = arr1[i] + arr2[i];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int n = arr1.length;
        int[] result = SumOfSameidx(arr1, arr2, n);
        System.out.println(Arrays.toString(result));
        
    }
}
