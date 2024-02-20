package concurrencyControl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class FailFastandSafe {
    public static void main(String[] args) {
      failSafeIterator();


    }
    public static void failFastIterator(){
          Map<String,String> phone=new HashMap<>();
        phone.put("Apple", "iPhone");
		phone.put("HTC", "HTC One");
		phone.put("Samsung", "S6");
        Set<String> kset=phone.keySet();
        Iterator<String> iterator=kset.iterator();
       while(iterator.hasNext()){
         phone.put("Sony", "xperia z");
         String phoneType=iterator.next();
         System.out.println(phoneType+"\t"+iterator.next());
       }
    }
    public static void failSafeIterator(){
        Map<String,String> phone=new ConcurrentHashMap<>();
         phone.put("Apple", "iPhone");
		phone.put("HTC", "HTC One");
		phone.put("Samsung", "S6");
        Set<String> kset=phone.keySet();
        Iterator<String> iterator=kset.iterator();
       while(iterator.hasNext()){
         phone.put("Sony", "xperia z");
         String phoneType=iterator.next();
         System.out.println(phone.get(phoneType)+"\t");
       }
       System.out.println(phone);

    }
}
