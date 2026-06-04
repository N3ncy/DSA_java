package Array;


public class MissingNum {
    public static void missingNumbers(int[] arr){
        int[] freq = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        for(int k = 0; k < freq.length; k++){
            if(freq[k] == 0){
                System.out.print(k + " ");
            }
        }   
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 5, 5, 6, 6};
        missingNumbers(arr);
    }
}
