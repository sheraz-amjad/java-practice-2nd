import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("Sheraz");
list.add("Faheel");
list.add("Saqib");
list.add("waleed");

/*Iterator itr = list.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
}*/
list.forEach(s -> System.out.println(s));
	
/*for(String obj:list)
	System.out.println(obj);
	}*/


}
}