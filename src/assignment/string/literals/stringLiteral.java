package assignment.string.literals;

public class stringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t= "Delhi";  

		String o = "Mumbai";

		String k= "delhi";  

		String y= new String ("Mumbai");  

		String l= new String ("delhi"); 

		String p = new String("Hello");
		System.out.println(" o with l - equals: " + o.equals(l) + " == :" + (o == l));
		System.out.println(" y with p - equals: " + y.equals(p) + " == :" + (y == p));
		System.out.println(" t with o - equals: " + t.equals(o) + " == :" + (t == o));
		System.out.println(" k with y - equals: " + k.equals(y) + " == :" + (k == y));
		System.out.println(" p with y - equals: " + p.equals(y) + " == :" + (p == y));
	
	}

	/*
	 * 


String t= "Delhi";  

String o = "Mumbai";

String k= "delhi";  

String y= new String ("Mumbai");  

String l= new String ("delhi"); 

String p = new String("Hello"); 

equals and ==

(1) o with l

(2) y with p

(3) t with o

(4) k with y

(5) p with y
	 */
}
