package assignment.a4.oops.a4_3_polymorphism_3.pkg_pen;

abstract class Pen {
	abstract public void  write();
	abstract public void  refill();
}

public class FountainPen extends Pen {

	public FountainPen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new FountainPen();
		p.write();
		p.refill();
		((FountainPen) p).nib();
	}
	public void nib() {
		System.out.println("FountainPen - inside method nib()");
	}

	@Override
	public void write() {
		System.out.println("FountainPen - Inside Abstarct method write()");
	}

	@Override
	public void refill() {
		System.out.println("FountainPen - Inside Abstarct method refill()");
	}
	
}
