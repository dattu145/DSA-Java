import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayLists{
    public static void main(String args[]){
        List<String> list = new ArrayList<>(List.of("H","I","J","K","L","M"));  // Type declaration

        list.add("A");        // add at end
        list.add(0, "B");     // add at index

        list.remove("A");     // remove by value
        list.remove(0);       // remove by index
        
        list.set(3,"Z");

        String val = list.get(0); // get element at index 0
        int size = list.size();   // get the size of the list

        list.contains("M");
        list.indexOf("M");
        list.lastIndexOf("M");
        list.isEmpty();

        for(String s : list){
            System.out.println(s);
        }

        Collections.sort(list);      //Ascending
        Collections.reverse(list);   //Reverse order

        list.forEach(System.out::println);

        list.clear();    // clears the list
    }
}