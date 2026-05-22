import java.util.Scanner;
public class fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int next = 0;
        int n = sc.nextInt();
            for(int i = 1; i<n; i++){
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(next);
        
    }
}
