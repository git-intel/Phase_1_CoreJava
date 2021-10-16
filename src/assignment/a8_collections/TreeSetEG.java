package assignment.a8_collections;

import java.util.TreeSet;

public class TreeSetEG {
	public static void main(String[] args) {

		  TreeSet<String> tSets = new TreeSet<String>();
		  TreeSet<Boolean> tSetb = new TreeSet<Boolean>();
	        
		    tSets.add("set");
		    tSets.add("14.232l");
	        tSets.add("1234");
	        tSetb.add(true);
	        tSetb.add(false);
	        tSetb.add(true);
	        
	        System.out.println("TreeSet <String> is : " + tSets);
	        System.out.println("TreeSet <Boolean>is : " + tSetb);

		}
}
