package Function;

public class Funcprac {

    //sum of even numbers
    public static int add(int start, int end){
        int sum = 0;
        for(int i = start; i<=end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    // nPr and nCr using Factorial
    public static int facto(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }

    public static int combi(int n, int r){
        return facto(n)/(facto(r)*facto(n-r));
    }

    public static int permu(int n, int r){
        return facto(n)/facto(n-r);
    }

    //Count of digits
    public static int countDigits(int num){
        int count = 0;
        for(int i = 1; i<=num; i++){
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(permu(8,9));
    }
}
