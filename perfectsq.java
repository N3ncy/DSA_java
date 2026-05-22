public class perfectsq {
    public static void main(String[] args) {
        for(int i=1; i<80; i++){
            if(i*i>=20 && i*i<=80){
            System.out.println(i*i);
            }
            if(i*i>80)
                break;
        }
    }
}
//i=10;
// if(i>=start/i && i<=end/i){
//     sout(i*i)
// }