
import java.util.*;
public class ArrayVsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		//int arraylength;
		//arraylength = scr.nextInt();
		String[] array = new String[3];
		String[] array1 = {"Muhammad","Zubair","Tahir"};
		array[0]="Muhammad";
		array[1]="Zubair";
		array[2]="Tahir";
		//array[3] = "Yes";
		//array.add("Yes")
		
		// Question int vs Integer
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Muhammad");
		arrayList.add("Tahir");
		Integer marks = 30;
		int marks1 = 30;
		System.out.println(array.length);
		System.out.println(arrayList.size());
		System.out.println(marks.MAX_VALUE);
		System.out.println(marks1);
		System.out.println(marks);
		arrayList.remove(0);
		
	}

}
