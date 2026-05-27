package Array;

public class Largest_array {
    public static int Largest(int[] arr){
        int largest = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 90};
        System.out.println(Largest(arr)); 
    }
}
