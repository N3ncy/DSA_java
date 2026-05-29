// You have been given an array arr that might contain duplicate elements. Your task is to find the maximum possible distance between occurrences of two repeating elements i.e. elements having the same value. If there are no duplicate elements in the array, print 0

package Array;

public class Max_distance {
    public static int maxDistance(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    max = Math.max(max, j-i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,7,3,3};
        System.out.println(maxDistance(arr));
    }
}
