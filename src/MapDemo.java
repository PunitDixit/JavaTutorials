import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hmap = new HashMap<String, String>();
		
		hmap.put("B", "1");   //PUTS KEYS IN ALPHABETICAL ORDER, ALSO CALLED AS NATURAL ORDER
		hmap.put("C", "2");
		hmap.put("A", "3");
		
		
		             Set<String>str = hmap.keySet();   //ITS RETURN TYPE IS SET THAT MEANS HMAP CANNOT HAVE DUPLICATE KEYS
		               
		             for(String s:str) {
		            	System.out.println(s+"  "+hmap.get(s));
		             }
		              
		             Set<Map.Entry<String, String>> map1 =hmap.entrySet();
		             Iterator<Map.Entry<String, String>> iterator = map1.iterator();
		             
		             
		             while (iterator.hasNext()) {
		            	 
		            	System.out.println(map1.contains("Punit"));
		             }
		             
		
	}

}
