package assignment.a4.oops.a4_2_polymorphism;

abstract class MNC {
	String name_of_company;
	String address_of_company;


	MNC(String name_of_company, String address_of_company) {
		this.name_of_company = name_of_company;
		this.address_of_company = address_of_company;
		System.out.println("MNC: Inside param constructor.");
	}
	abstract public  void nameOfCompany();
	abstract public  void addressOfHQ();
	
	public void detailsOfMNC() {
		System.out.println("MNC- Name of MNC : "
				+ name_of_company);
		System.out.println("MNC- Location of HQ : "
				+ address_of_company);	
	}
}

abstract class Infosys extends MNC {
	
	public Infosys(String name, String address) {
		super(name, address);
		System.out.println("Infosys: Inside constructor.");
	}


	public abstract void addressOfHQ() ;
	public void nameOfCompany() {
		System.out.println("Infosys - inside abstract method nameOfCompany()");
	}



}

class Hello extends Infosys {
	
	public Hello(String name, String Address) {
		super(name, Address);
		System.out.println("Hello: Inside constructor.");
	}

	public void nameOfCompany() {
		System.out.println("Hello - inside abstract method nameOfCompany()");
	}

	public void addressOfHQ() {
		System.out.println("Hello - inside abstract method addressOfHQ()");
	} 
	
	public void domainOfCompany() {
		System.out.println("Hello - inside normal method domainOfCompany()");
	}

}
public class AbstractMain {

	public static void main(String[] args) {

		MNC obj = new Hello("HelloWorld", "CA");
		obj.detailsOfMNC();
		obj.nameOfCompany();
		obj.addressOfHQ();
		((Infosys) obj).nameOfCompany();
		((Hello) obj).domainOfCompany();
	}

}
