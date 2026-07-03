 import java. util.*;
public class calci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a =sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int option=sc.nextInt();

        switch(option){
              case 1:System.out.println(a+b);
              break;
              case 2:System.out.println(a-b);
              break;
              case 3:System.out.println(a*b);
              break;
              case 4:System.out.println(a/b);
              break;
                  
        }
    }
} 
