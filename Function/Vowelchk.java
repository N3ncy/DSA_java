package Function;


public class Vowelchk {
    public static boolean isVowel(char a){
        a = Character.toLowerCase(a);
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isVowel('B'));
    }
}
