public class func {
    public static boolean checkAge(int age){
        if(age > 18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(checkAge(19));
    }
}
