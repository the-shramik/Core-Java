import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;


public class HashMapEx{
    public static void main(String[] args){
    
       HashMap<String,String> hm=new HashMap<String,String>();
     
       hm.put("Hardik", "PBUG");
       hm.put("Guru", "CRICKET");
       hm.put("Ronaldo","FOTBALL");

       Set<String> s=hm.keySet();
       System.out.println(s);

       Collection<String> c=hm.values();
       System.out.println(c);

       Set<Entry<String,String>> e=hm.entrySet();
       for(Entry ee:e){
          
        System.out.println(ee.getKey()+" : "+ee.getValue());

       }

       }

    
}