 import java.util.*;
 class Sort{
 public static void main(String args[]){
 ArrayList<String> list=new ArrayList<String>();
 list.add("Imran");
 		//Adding object in arraylist
 list.add("Ahsan");
 list.add("Ayesha");
 list.add("Ali");
 Collections.sort(list);
 //Collections.sort(list, Collections.reverseOrder());
 Iterator itr=list.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 } } }