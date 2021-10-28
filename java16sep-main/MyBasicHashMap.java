import java.util.HashMap;
 
public class MyBasicHashMap {
 
    public static void main(String args[]){
        HashMap<Integer, String> hm = new HashMap<>();
        //add key-value pair to hashmap
        hm.put(1, "Ramu Kaka");
        hm.put(2, "Bobita ji");
        hm.put(3, "Titu Mama");
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of second: "+hm.get(2));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove(1);
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
    }
}