

public class pos2 {
    public static void main(String[]args){
        int num=5;
        int pos=2;
        int bitMask=(1<<2);
        int notBitMask=~(bitMask);
        int newNumber=notBitMask & num;
        System.out.println(newNumber);

    }
}
