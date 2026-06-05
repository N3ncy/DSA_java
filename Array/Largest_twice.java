//LArgest number At Least Twice of Others
package Array;

public class Largest_twice {
    public static int largestAtLeastTwice(int[] arr){
        int max = 0;
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                k = i;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != max && (arr[j] * 2) > max){
                return -1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 0};
        System.out.println(largestAtLeastTwice(arr));
    }
}
