import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceHashMap {

	public static void main(String[] args) {

		String str ="My name is Punit I am from Bangalore I like Bangalore Lets the ";


		//STEP 1 : SPLIT THE STRING INTO AN ARRAY AND PUT IN HASHMAP <STRING, INTEGER>
		String [] strSplit = str.split(" ");

		HashMap<String, Integer> hmap = new HashMap<>();

		for (String s : strSplit) {

			if (hmap.get(s)!=null){
				hmap.put(s.trim(), hmap.get(s)+1);
			}
			else {
				hmap.put(s.trim(), 1);
			}	

		}

		//TO CHECK KEYs 
		Set<String> set =hmap.keySet();

		//First way to print hmap values

		for (String k:set) {

			if(hmap.get(k)>1)
				System.out.println(k+"*****"+hmap.get(k));
		}


		//Second way of printing hmap value

		Iterator<String> key =  hmap.keySet().iterator();

		while(key.hasNext()) {

			String temp = key.next();
			if (hmap.get(temp)>1) {
				System.out.println(temp+ "  "+hmap.get(temp));
			}
		}

		//Third Way

		Set<Entry<String,Integer> > eset  =  hmap.entrySet();

		for(Entry<String, Integer > s: eset) {

			if (s.getValue()>1)
				System.out.println(s.getKey()+ "  "+s.getValue());
		}


	}

}
