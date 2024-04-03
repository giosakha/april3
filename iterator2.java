package april3;
import java.util.*;
public class iterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list1 = new ArrayList<Integer>();
//ArayList fill 10 integers 1-10
for (int i=0;i<10;i++) list1.add((int) (Math.random()*10)+1);
System.out.println("ArrayList: ");
for (Iterator<Integer> i  = list1.iterator(); i.hasNext();) {
	System.out.println(i.next() + " ");
}
System.out.println();

	}

}
