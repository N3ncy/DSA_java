package Array;

public class Linear_search {
    public static int linSearch(int arr[], int n, int target){
       
        for(int i = 0; i< n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,9,8};
        int n = arr.length;
        int target = 9;
        System.out.println(" ");
    }
    
}
