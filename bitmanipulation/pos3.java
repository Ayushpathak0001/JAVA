public class pos3{
    public static void main(String[]args){
        int num=7;
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask & num)==0){
            System.out.println("The bit was Zero");
        }else{
            System.out.println("The bit was One");
        }
    }
}