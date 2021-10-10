package assignment.a4.oops.a4_4_polymorphism;

abstract class Telephone {

	public Telephone() {
		System.out.println("@Telephone: Constructor.");
	}
	abstract void lift();
	abstract void disconnected();
}
