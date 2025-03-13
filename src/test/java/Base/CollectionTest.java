package Base;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   HashMap<String, Integer> map= new HashMap<>();
	        map.put("pratik veer", 1);
	        map.put("Quality Analyst", 2);
	        map.put("Automation Tester", 3);
	        map.put("API Automation", 4);

	        System.out.println(map);

	         for(String key: map.keySet())
	         {
	         System.out.println(key);
	         }


	         for(int value: map.values())
	         {
	             System.out.println(value);
	         }


	         for(Entry<String, Integer> entry: map.entrySet())
	         {
	             System.out.println(entry);
	         }

	         String present="pratik veer";

	         if(map.containsKey(present))
	         {
	             System.out.println("present");
	         }
	         else
	         {
	             System.out.println("not present");
	         }


	        TreeMap<String, Integer> mapsort=new TreeMap<>(map);

	        for(Entry<String, Integer> sortvalues: mapsort.entrySet())
	        {
	            System.out.println(sortvalues);
	        }

	}

}
