package assignment.modifiers.pkg.one;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M objM = new M();
		System.out.println("protected float of class M:" + objM.var_m_f);
		System.out.println("default long of class M:" + objM.var_m_l);
		objM.printPrivateVariables();
		N objN = new N();
		System.out.println("protected long of class N:" + objN.var_n_l);
		System.out.println("public  int of class N:" + objN.var_n_i);
		System.out.println("protected float of class N:" + objN.var_n_f);
	}

}
