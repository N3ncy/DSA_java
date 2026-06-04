package Array;

public class GPTriplets {
    public static void triplets(int[] arr, int n){
        for(int j=1; j<n-1; j++){
            int i = j-1;
            while(i >=0){
                int k = j+1;
                while(k < n){
                    if(arr[j] * arr[j] == arr[i] * arr[k]){
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    }
                    k++;
                }
                i--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16};
        int n = arr.length;
        triplets(arr, n);
    }
}
