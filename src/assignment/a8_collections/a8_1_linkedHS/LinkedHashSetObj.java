package assignment.a8_collections.a8_1_linkedHS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet L1 = new LinkedHashSet();
		
		L1.add(45);
		L1.add(45.5f);
		L1.add(4.5f);
		L1.add('c');
		L1.add('d');
		L1.add(true);
		System.out.println("the linkedhasset L1is:" + L1);
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>(); 
		L2.add(2);
		L2.add(1);
		L2.add(5);
		L2.add(3);
		L2.add(5);
		L2.add(6);
		L2.add(4);
		System.out.println("the linkedhasset L2is:" + L2);
	}

}
