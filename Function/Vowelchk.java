package Function;


public class Vowelchk {
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isVowel('B'));
    }
} 
