//Write a program to count all elements in array less than X.
package Array;

public class Arraylessthnx {
    public static int arrLessThnX(int[] arr, int x){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 1;
        System.out.println(arrLessThnX(arr, x));
    }
}
