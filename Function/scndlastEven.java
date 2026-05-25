package Function;


public class scndlastEven {
    public static boolean secondLastEven(int num){
        int count = 0;
        while(num > 0){
            count++;
        
        if(count == 2){
            int digit = num%10;
            if(digit %2 == 0){
                return true;
            }
       }
       num /= 10;
    }
    return false;
    
}
public static void main(String[] args) {
    System.out.println(secondLastEven(2345));
}

}
