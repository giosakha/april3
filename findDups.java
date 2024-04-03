package april3;
import java.util.*;
public class findDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> s  = new HashSet<>();
for (int i =0 ; i <args.length ; i++) {
	if(!s.add(args[i])) System.out.println("Duplicate detected: " + args[i]);
}
	System.out.println(s.size() + " distinct words detected: " + s);
	}

}
