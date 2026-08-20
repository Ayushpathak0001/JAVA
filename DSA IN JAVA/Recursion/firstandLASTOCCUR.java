public class firstandLASTOCCUR {

    public static int first=-1;
    public static int last=-1;
    public static void occurence(int idx,char element,String src){
        if (idx == src.length()) {
    System.out.println("First: " + first);
    System.out.println("Last: " + last);
    return;
}
       char currentChar=src.charAt(idx);
        if(currentChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        occurence(idx+1,element,src);
    }
    
    
    public static void main(String[]args){
    int idx=0;
    String src="abaacdaefaah";

       occurence(idx, 'a', src);
    }
}

//time complexity O(n)

