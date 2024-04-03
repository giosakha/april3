package april3;
import java.util.*;
public class iterator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
//obtain an iterator instance from the collection 
Iterator<String> iterator  = names.iterator();
//iterating through the collection using the iterator
while(iterator.hasNext()) {
	String name = iterator.next();
	if (name.equals("Bob")) iterator.remove(); //remove bob from the collection
	
}
//print the modified collcetion
System.out.println(names);
	}

}
