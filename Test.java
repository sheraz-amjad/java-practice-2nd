import java.util.*;
 class Test{
 public static void main(String args[]){
 ArrayList<String> list=new ArrayList<String> () ;
 System.out.println("Unsorted array elements:");
 list.add("Hearts");
 list.add("Diamonds");
 list.add("Clubs");
 list.add("Spades"); 
 System.out.println(list);
 System.out.printf("Sorted array elements:");
 Collections.sort(list);
 System.out.println(list); 
 } }