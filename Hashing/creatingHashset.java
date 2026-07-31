import java.util.HashSet;
import java.util.Iterator;
public class creatingHashset {
  public static void main(String[]args){
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(1);
    set.remove(3);

    System.out.print(set);
    System.out.println();
     set.remove(3);
     System.out.print(set);
      System.out.println();
    if (set.contains(2)){
          System.out.println("contains 2");
    }
    if(!set.contains(6)){
      System.out.println("It does not contain 6");
    }
   Iterator it=set.iterator();
   while(it.hasNext()){
    System.out.println(it.next());
   }
   for(int num:set){
    System.out.println(num);
   }
    }
  }
