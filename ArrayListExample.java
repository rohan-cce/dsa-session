import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList();
        
        //insertion
        array.add(10);
        array.add(20);
        array.add(28);
        
        array.add(2, 25);
        
        // retrival
        
        
         System.out.println(array.get(2));
         System.out.println(array.getFirst());
         System.out.println(array.getLast());
        
        10,20,25,28
        array.remove(3);
        
        System.out.println(array.contains(26));
        array.remove(Integer.valueOf(26));
        
        if(array.contains(26)){
            // remove
        }else{
            //ignore
        }
        
        System.out.println(array.size());
        
        for(int num: array){
            System.out.println(num);
        }
            
        array.clear();
        
        for(int num: array){
            System.out.println(num);
        }
        
      
    
        
    
        
    }
}
