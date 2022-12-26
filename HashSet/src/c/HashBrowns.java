package c;

import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {

	public static void main(String[] args) {
		
//		int[] a = {3, 5, 1};
//		System.out.println(a[1]);
		
		HashSet<String> h = new HashSet<String>();
		h.add("lemur");
		h.add("Gorilla");
		h.add("Orangatang");
		h.add("Spider Monkey");
		
		h.remove("Gorilla");
//		h.clear();
		
		System.out.println(h);
		System.out.println(h.contains("Spider Monkey"));
		System.out.println(h.contains("chimpanzee"));
		
//====================================================================
		//Integer vs int = object int vs primative int
		HashSet<Integer> hashBrowns = new HashSet<Integer>();
		hashBrowns.add(13);
		hashBrowns.add(24);
		hashBrowns.add(5);
		
		Object[] hash = hashBrowns.toArray();
		
		Iterator<Integer> it = hashBrowns.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(hashBrowns);
		System.out.println(hash[0]);
		System.out.println(hashBrowns.hashCode());
		

	}

}
