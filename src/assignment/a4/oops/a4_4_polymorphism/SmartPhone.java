package assignment.a4.oops.a4_4_polymorphism;

public class SmartPhone extends Telephone {

	public SmartPhone() {
		super();
		System.out.println("@SmartPhone: Constructor.");
	}

	@Override
	void lift() {
		System.out.println("@SmartPhone: Override lift.");
	}

	@Override
	void disconnected() {
		System.out.println("@SmartPhone: Override disconnected.");
	}

	public static void main(String[] args) {
		Telephone phone = new SmartPhone();
		phone.lift();
		phone.disconnected();
	}

}
