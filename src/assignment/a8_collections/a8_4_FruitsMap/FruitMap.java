package assignment.a8_collections.a8_4_FruitsMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FruitMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Map<Integer, String > linkedHashMap = new LinkedHashMap<Integer, String  >();
        linkedHashMap.put(1, new String("Mango"));
        linkedHashMap.put(2, new String("BlueBerry"));
        linkedHashMap.put(4, new String("Apple"));
        linkedHashMap.put(3, new String("Banana"));
        linkedHashMap.put(6, new String("JackFruit"));
        linkedHashMap.put(5, new String("Pappaya"));

        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        System.out.println("\nSorted List ");
        Map<Integer, String> map = new TreeMap<Integer, String>(linkedHashMap);
        for (Integer key : map.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
    }

}
