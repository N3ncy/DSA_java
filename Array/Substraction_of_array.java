package Array;

public class Substraction_of_array {
    public static int[] arraySubtraction(int[] arr1, int[] arr2, int m, int n ){
        int borrow = 0;
        int i = m-1;
        int j = n-1;
        int max = Math.max(m, n);
        int k = max -1;
        int[] res = new int[max];
        
        while(i>=0 || j>= 0){
            int x = (i>=0? arr1[i] : 0) -  borrow;
            int y = (j >= 0? arr2[j] : 0);

            if(x<y){
                x += 10;
                borrow = 1;
            }else{
                borrow = 0;
            }
            res[k] = x- y;
            i--;
            j--;
            k--;
            }
            
            return res;
        }


    
    public static void main(String[] args) {
        int[] arr1 = {1 , 2, 3};
        int[] arr2 = {1, 0, 7};
        int m = arr1.length;
        int n = arr2.length;
        int[] result = arraySubtraction(arr1, arr2, m, n);
        for(int num: result){
            System.out.print(num + " ");
        }
    }

}
