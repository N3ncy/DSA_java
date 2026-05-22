import java.util.*;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int n = sc.nextInt();

        for(int i = 2; i<n-1; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
        System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
