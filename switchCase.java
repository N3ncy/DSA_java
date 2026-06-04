import java.util.Scanner;
public class switchCase{
    public static void week(){
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 3;
        char choice = sc.next().charAt(0);
        switch(choice){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(a!=0){
                System.out.println(a/b);
                }
                else{
                    System.out.println("Not divisible by zero");
                }
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid");
        }
    }
    public static void main(String[] args){
        week();
    }
}
