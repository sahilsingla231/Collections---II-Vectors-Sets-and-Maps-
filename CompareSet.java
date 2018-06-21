package javaset;

import java.util.HashSet;

public class CompareSet {

	 public static void main(String[] args) {
	        HashSet<Integer> set1 = new HashSet<>(); // if remove <> can store of any type by -HashSet set1 = new HashSet();
	        HashSet<Integer> set2 = new HashSet<>();
	        set1.add(1); 
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);
	        set2.add(5);
	        set2.add(6);
	        set2.add(1);
	        set2.add(2);
	        set1.add(3);
	        System.out.println("HashSet 1 is " + set1);
	        System.out.println("HashSet 2 is " + set2);
	        set1.retainAll(set2);
	        System.out.println("Elements which are same on both sets are " + set1);
	    }
	
	
	
}
