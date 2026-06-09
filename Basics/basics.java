import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0){
        rev = rev *10+num % 10;
        num = num/10;
        }
        if(rev == temp){
        System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
