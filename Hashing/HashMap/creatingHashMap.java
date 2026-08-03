import java.util.*;

public class creatingHashMap {
    public static void main(String[]args){
        HashMap<String,Integer> studentInfo=new HashMap<>();
        
        //add elements in hashmap
        studentInfo.put("Ayush",98);
        studentInfo.put("arnav",87);
        studentInfo.put("aditi",89);
        System.out.println(studentInfo+" ");

          // iteration
    for(Map.Entry<String,Integer> infos: studentInfo.entrySet()){
        System.out.print(infos.getKey()+" ");
        System.out.println(infos.getValue()+" ");
    }

    Set<String> keys=studentInfo.keySet();
    for(String key:keys){
        System.out.println(key+" "+studentInfo.get(key));
    }

    studentInfo.remove("arnav");
    Set<String>key= studentInfo.keySet();
    for(String val:key){
      System.out.println(val+" "+studentInfo.get(val));
    }
    }

  
    
}
