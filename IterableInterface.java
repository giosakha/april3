package april3;
import java.util.*;
import java.util.Iterator;

public class IterableInterface implements Iterable<String> {
private String[] elements;
	
public IterableInterface(String[] elements) {

	this.elements = elements;
}

@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator();
	}
	//inner class implementing iterator
	private class MyIterator implements Iterator<String>{
private int index=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
		return index<elements.length;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
		return elements[index++];
		}
		
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
String[] names = {"Alice" , "Bob" , "Charlie"};
IterableInterface iterable = new IterableInterface(names);
		//using for each loop to iterate
for (String name: iterable) System.out.println(name);
		}
	}


