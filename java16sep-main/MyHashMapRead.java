import java.util.HashMap;
import java.util.Set;
 
public class MyHashMapRead {
    public static void main(String args[]){
        HashMap<Integer, String> hm = new HashMap<>();
        //add key-value pair to hashmap
        hm.put(2, "Ramu Chacha");
        hm.put(3, "Bibita ji");
        hm.put(1,"Titu Mama");
        System.out.println(hm);
        Set<Integer> keys = hm.keySet();
        for(Integer key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
    }
}