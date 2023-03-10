package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreesetSamples
		
//		TreeSet<String> evenNumber = new TreeSet<String>();
//		
//		//using add()method
//		evenNumber.add("Jaa");
//		evenNumber.add("Prasanth");
//		evenNumber.add("Ak");
//		evenNumber.add("Mani");
//		//while printing it will be ordered
//		System.out.println("HashSet: "+evenNumber);
//		
//		
//		//calling iterator()method
//				Iterator<String> Iterate= evenNumber.iterator();
//				System.out.println("TreeSet using Iterator: ");
//				while(Iterate.hasNext()) {
//					System.out.print(Iterate.next());
//					System.out.print(", ");
//				}
		
		
		
		
		
		//HashSetSamples
        HashSet<Integer> evenNumber = new HashSet<Integer>();
		
		//using add()method
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(6);
		//while printing it will be ordered
		System.out.println("HashSet: "+evenNumber);
		
		//calling iterator()method
		Iterator<Integer> Iterate= evenNumber.iterator();
		System.out.println("HashSet using Iterator: ");
		while(Iterate.hasNext()) {
			System.out.print(Iterate.next());
			System.out.print(", ");
		}
		
		
		
	}

}
