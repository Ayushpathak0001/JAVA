public class removeDublicates{
    public static boolean[]map=new boolean[26];
    public static void removeDublicates(String str,int idx, String newString){
        if(idx==str.length()){
            System.out.print(newString);
            return;
        }

        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            removeDublicates(str,idx+1,newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDublicates(str,idx+1,newString);
        }
    }
    public static void main(String args[]){
        String str="abbccda";
        removeDublicates(str,0,"");
    }

}

// time complexity O(n)