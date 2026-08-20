/* 

public class sumofNnumbers {
    public static void sumofNno(int i,int sum){
        if(i==0){
            System.out.println(sum);
           return;
        }
            
            sumofNno(i-1,sum+i);
    }
        
    public static void main(String[]args){
            sumofNno(5,0);
        }
    }
 */
      
public  class prinSum{
    public static void printSum(int i,int n,int sum){
        if(i==n+1){
           
            System.out.print(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void main(String[]args){
         printSum(1,5,0);
    }
}