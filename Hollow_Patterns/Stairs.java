package Hollow_Patterns;

public class Stairs {
    public static void main(String[] args) {
        int n = 4;
        int stars = 2;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=stars; j++){
                System.out.print("*");
            }
           
            if(i%2==0){
            stars += 2;
        }
        System.out.println();
        }
        
    }
}
