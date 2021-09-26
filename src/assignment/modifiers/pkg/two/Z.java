package assignment.modifiers.pkg.two;
import assignment.modifiers.pkg.one.M;
import assignment.modifiers.pkg.one.N;

public class Z extends M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z objZ = new Z();
		objZ.printPrivateVariables();
		objZ.printDefaultVariables();
		System.out.println("protected float of class M:" + objZ.var_m_f);

		N objN = new N();
		System.out.println("public int of class N:" + objN.var_n_i);
		objN.printProtectedVariables();
		
		X objX = new X();
		objX.printPrivateVariables();
		System.out.println("default long of class x:" + objX.var_x_l);
		System.out.println("protected float of class x:" + objX.var_x_f);
		System.out.println("public char of class x:" + objX.var_x_c);
		
	}


}
