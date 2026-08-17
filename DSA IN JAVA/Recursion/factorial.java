

public class factorial {
    public static int factorial (int n, int fact){
        if(n==0 ||n==1){
            
            return fact;
        }
       return  factorial(n-1,fact*=n);

    }
    public static void main(String[]args){
    System.out.print( factorial(5,1));
    }
}
