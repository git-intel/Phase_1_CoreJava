package assignment.one.modifiers.pkg.two;


import assignment.one.modifiers.pkg.one.M;
import assignment.one.modifiers.pkg.one.N;

public class Y extends N{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y objY = new Y();
		System.out.println("protected float of class N:" + objY.var_n_f);
		System.out.println("public  int of class N:" + objY.var_n_i);
		System.out.println("protected float of class N:" + objY.var_n_f);

		M objM = new M();
		objM.printPrivateVariables();
		objM.printDefaultVariables();
		objM.printProtectedVariables();
	}

}
