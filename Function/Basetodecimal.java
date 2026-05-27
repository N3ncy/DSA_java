package Function;

public class Basetodecimal {
    public static int toDecimal(String num, int currentBase){
        int decimal = 0;
        int power = 1;
        for(int i= num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            int digit;
            if(ch >= '0' && ch<= '9'){
                digit = ch - '0';
            }else{
                digit = ch - 'A' + 10;
            }
            decimal = decimal + (digit*power);
            power *= currentBase;
        }
        return decimal;
    }
    public static void main(String[] args) {
        String num = "110";
        int currentBase = 2;
        System.out.println(toDecimal(num, currentBase));
    }
}
