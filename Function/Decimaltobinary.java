package Function;

public class Decimaltobinary {
    public static int decTobi(int num){
        int new_num = 0;
        int update = 1;
        while(num > 0){
            int rem = num % 2;
            new_num = new_num + rem*update;
            update *= 10;
            num /=2;
            
        }
    
        return new_num;
    }
    public static void main(String[] args) {
        System.out.println(decTobi(50));
    }
}
