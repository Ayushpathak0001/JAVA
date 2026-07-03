import java.util.*;

public class multiplyoftwono {
    public static int printProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        System.out.println(product);
        printProduct(a,b);
    }
}
