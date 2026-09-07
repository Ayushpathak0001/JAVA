import java.util.*;


public class collectionFramework {
    public static void main(String[]args){
LinkedList<String> list=new LinkedList<String>();
list.addFirst("A");
list.addFirst("b");
list.addFirst("c");
list.addFirst("d");
list.addLast("f");
list.addLast("g");
list.addLast("l");
System.out.println(list.size());

System.out.print(list);
for(int i=0;i<list.size();i++){
    System.out.println(list.get(i)+"->");

}
list.removeFirst();
System.out.println(list);
list.removeLast();
System.out.println(list);
list.remove(2);
System.out.println(list);

}
}
