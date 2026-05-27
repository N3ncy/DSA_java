//Find element at given index
package Array;

public class Find_ele {
    public static int findElement(int[] arr, int i){
        return arr[i];
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int i = 2;
        System.out.println(findElement(arr, i));
    }
}
