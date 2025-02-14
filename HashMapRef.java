import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        
        // insertion
        map.put("TN","Tamilnadu");
        map.put("KA","Karnataka");
        map.put("KL","Kerala");
        
        search
        System.out.println(map.get("TN"));
        System.out.println(map.get("KA"));
        System.out.println(map.get("AP"));
        System.out.println(map.getOrDefault("AP", "Not found"));
        
        
        System.out.println(map.keySet());
        System.out.println(map.values());

        
        for(String key : map.keySet()){
             System.out.println(key + " " +map.get(key));
        }
        
        
        //remove
        map.remove("KL");
        
         for(String key : map.keySet()){
             System.out.println(key + " " +map.get(key));
        }
        
        System.out.println(map.containsKey("AP"));
        System.out.println(map.containsValue("Tamilnadu"));

        System.out.println(map.size());
        
        map.remove("KA");
        map.remove("TN");
        System.out.println(map.isEmpty());
        
    }
}
