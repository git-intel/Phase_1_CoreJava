package assignment.a8_collections.a8_2_TreeS;

import java.util.TreeSet;

public class TreeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("C#");
        treeSet.add("Cpp");
        treeSet.add("JS");
        treeSet.add("Perl");
        treeSet.add("Python");
        treeSet.add("Java");
		
		System.out.println("the Treeset is:" + treeSet);
		treeSet.remove("Cpp");
		treeSet.remove("Perl");
		System.out.println("the Treeset is:" + treeSet);
	    System.out.println("treeSet.contains(\"Java\") :" + treeSet.contains("Java"));
	
	    treeSet.clear();
	    System.out.println("the Treeset is:" + treeSet);
		   
	}

}
