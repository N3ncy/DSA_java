package Function;

public class Decimaltobase {
    public static String fromDecimal(int decimal, int targetBase){
        if(decimal == 0){
            return "0";
        }
        String result = "";
        while(decimal > 0){
            int rem = decimal % targetBase;
            if(rem < 10){
                result += rem;
            }else{
                result = (char)(rem - 10 + 'A') + result;
            }
            decimal = decimal/targetBase;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fromDecimal(12, 16));
    }
}
