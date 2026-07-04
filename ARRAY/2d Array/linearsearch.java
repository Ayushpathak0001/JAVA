import java.util.*;

public class linearsearch {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=sc.nextInt();
        int num[][]= new int[rows][cols];
        System.out.print("Enter elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter number to search: ");
        int search=sc.nextInt();
        
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(num[i][j]==search){
                    System.out.print("Element"+num[i][j]+" found at row " + i+" and column "+j);
                }
            }
            System.out.println();
        }
    }
    
}
