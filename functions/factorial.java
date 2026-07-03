import java.util.*;

public class factorial {
    public static int printFactorial(int num){
    int fact=1;
    if(num<0){
        System.out.print("invalid conditon");
        return -1;
    }
        if(num==0 ||num==1){
        return fact=1;
    }else{
    for(int i=1;i<=num;i++){
        fact*=i;
    }
    System.out.print(fact);
        return fact;
    }
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printFactorial(num);
    }
}
