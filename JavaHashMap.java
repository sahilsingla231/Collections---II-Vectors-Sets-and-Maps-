package javaset;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class JavaHashMap {
	
	public static void main(String abc[]) {
		
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		Scanner sl = new Scanner(System.in);
		System.out.println("Enter any five Strings");
		String str;
		for(int i=1;i<=5;i++)
		{
		    str = sl.nextLine(); //sentences are also allowed...
			obj.put(i,str);
		}
		
		for(Entry<Integer, String> e : obj.entrySet()) {
			System.out.println(e.getKey() + "-->" + e.getValue());
			
		}
		//for particular fetch
		System.out.println("Enter any integer key from 1 to 5 to get its mapped value-");
		int a=sl.nextInt();
		String val=obj.get(a);
	     System.out.println("The Value mapped to Key entered is:"+ val);
	     sl.close();
		
		

		
	}

}
