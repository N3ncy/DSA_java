package Array;

public class Reversearr {
    public static void reverseArr(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr  = { 1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length;
        reverseArr(arr, start, end);
        for(int num : arr){
            System.out.println(num);
        }
    }
}
