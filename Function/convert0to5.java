package Function;

public class convert0to5 {
    public static int convert0sto5(int num){
        int result = 0;
        while(num >0){
            int digit = num % 10;
            if(digit == 0){
                result = result*10 + 5;
            }else{
                result = result *10 + digit;
            }
            num /= 10;
        }

        int rev = 0;
        while(result > 0){
        int dig = result % 10;
        rev = rev * 10 + dig;
        result = result / 10;

        }


        return rev;
    }
    public static void main(String[] args) {
        System.out.println(convert0sto5(1003));
    }

}
