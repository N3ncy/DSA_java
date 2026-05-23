package Function;

public class Shadowing {
    static int a = 10; 
    
    public void add(int a){
        System.out.println(this.a);
    }
    public static void main(String[] args) {

        /*object is created bcz "this" is an instance variable which belongs to specific object*/
        Shadowing obj =new Shadowing(); // This is object creaction
        obj.add(5);
    }
    
}
