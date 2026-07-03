import java.util.*;
public class searchno{
    public static void main(String args[]){
        System.out.print("Enter size of array: ");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search no: ");
        int searchNo=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==searchNo)
            System.out.println("Element "+arr[i]+" founnd at index "+i);
        }
    }
}