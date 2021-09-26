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
}
