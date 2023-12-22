
import java.util.HashMap;
import java.util.Map;
public class MAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		// adding keys and values
		
		map.put(1, "Zubair");
		map.put(2, "Tahir");
		map.put(3, "Muhammad");
		
		//Printing the Map
		for (Map.Entry<Integer, String> itr:map.entrySet()) {
			int key = itr.getKey();
			String value = itr.getValue();
			System.out.println("Key = "+key+ ", Value = "+value);
		}
	}
}