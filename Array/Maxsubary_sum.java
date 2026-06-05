//Maximux sum subarray of length k
package Array;

public class Maxsubary_sum {
    public static int maxSubArray(int[] arr, int k){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length - k; i++){
            int sum = 0;
            for(int j = i; j < i+k;  j++ ){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSubArray(arr, k));
    }
}
