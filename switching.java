import java.util.*;
public class switching {
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();
        switch(num){
            case 1:System.out.println("Namaste");
            break;
            case 2:System.out.println("Hello");
            break;
            
            case 3:System.out.println("bonjour");
            break;
            default:System.out.println("invalid");

        }
    }
}
