package assignment.modifiers.pkg.one;

public class M {
	 private  int var_m_i = 10;
	 long var_m_l = 10101010101l;
	 protected float var_m_f = 102.12f;
	 
	 public void printPrivateVariables() {
		 System.out.println("private int of class M:" + var_m_i);
	 }
	 public void printDefaultVariables() {
		 System.out.println("default long of class M:" + var_m_l);
	 }
	 public void printProtectedVariables() {
		 System.out.println("protected float of class M:" + var_m_f);
	 }
/*
 * Assignment 1:

M, N , P will have all the  4 types of access modifier methods , public, default, private and protected

M class  --> 
 private  int 
 default long
 protected float

N class  --->
  protected long 
  public int
  default double


P class  -->
 call and print the variables of class M and N


X class -->
 private  int 
 default long
 protected float
 public char

Y class --->
 call all the methods of the N, M class and call all the variables of the class X

Z class  -->
 call all the methods of the N, M, P class and call all the variables of the class X





Assignment submitted at 
git@github.com:git-intel/Phase_1_CoreJava.git

 */
}
