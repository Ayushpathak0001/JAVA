import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String []args){
        ArrayList<Integer>list =new ArrayList<Integer>();
        // addElement

        list.add(0);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get elements

    int element=list.get(3);
    System.out.println(element);
    

     // add element in between
     list.add(2,8);
     System.out.println(list);


     //set element

     list.set(0,5);
     System.out.println(list);
     

     //delete element
     list.remove(3);
     System.out.println(list);

     //size
     int size=list.size();
     System.out.println(size);

     //loops

     for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
     }

     //sorting

    Collections.sort(list);
    System.out.println(list);
















    }

   

    


    
}
