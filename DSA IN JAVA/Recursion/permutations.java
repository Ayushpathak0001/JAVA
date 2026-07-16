//print all permutations of a string

public class permutations {
    public static void printPerm(String str,String permutations){
        if(str.length()==0){
            System.out.println(permutations);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr,permutations+currChar);
        }
    }
    public static void main(String[]args){
        String str="abcde";
        printPerm(str,"");

    }
}
    //timecomplexity O(n!)