package april3;
import java.util.*;
public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1 = new ArrayList<>();
List<Double> list2 = new ArrayList<>();
Set<Integer>set1 = new HashSet<Integer>();
Set<Double>set2 = new TreeSet<Double>();
for ( int i =0; i<10;i++) { //arraylist fill 10 integer 1-10
	list1.add((int) ((Math.random()*10)+1));
}
//linkedlist fill 10 doubles 0-.99
for (int i=0;i<10;i++) {
	list2.add((double) (((int)(Math.random()*100))/100.0));
}
for (int i=0; i<10;i++) { //hashset fill 10 (as long as there are no duplicates (integers 1-10)
	set1.add((int) (Math.random()*10)-1);
}
for (int i=0; i<10;i++) { //treeset fill 10 (as long as there are no duplicates (doubles 0-.99)
	set2.add((double) ((int) (Math.random()*10)-1));
}
Iterator<Integer> here1 = list1.iterator(); //ArrayList iterator
Iterator<Double> here2 = list2.iterator(); //LinkedList iterator
Iterator<Integer> here3 = set1.iterator(); //HashSet iterator
Iterator<Double> here4 = set2.iterator(); //TreeSet iterator
	}

}
