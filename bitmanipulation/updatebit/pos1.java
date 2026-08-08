import java.util.*;

public class pos1 {
    public static void main(String[]main){
        int num=5;
        int pos=1;
        int bitMask=1<<pos;
        Scanner sc=new Scanner (System.in);
        int update =sc.nextInt();
        if(update ==1){
            int newNumber= bitMask | num;
            System.out.println(newNumber);
        }else{
            int newNumber=~bitMask & num;
            System.out.println(newNumber);
        }
    }
}
