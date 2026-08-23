public class reverseString {
    public static void reverseString(int i,String src){
         if(i<0){
            return;
         }
         System.out.print(src.charAt(i));
        reverseString(i-1,src);
    }
    public static void main(String[]args){
        String src="My Name Is Ayush and i want to become a Software Engineer";

     int i=src.length()-1;
     reverseString(i,src);
    }
}
