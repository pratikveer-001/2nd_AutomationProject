package Base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<>();
		name.add("raju");
		name.add("pratik");
		name.add("rahul");
		name.add("raju");
		name.add("pratik");

		Set<String> s= new HashSet<>();

		for(String name1 : name)
		{
			if(s.add(name1)) {
				System.out.println(name1);
			}
		}
	}

}
