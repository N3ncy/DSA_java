package Function;

public class Binarytodecimal {
    public static int binTodec(int num){
        int result = 0;
        int update = 1 ;
        while(num>0){
            int rem = num % 10;
            result += rem*update;
            update *= 2 ;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(binTodec(10010));
    }
}
