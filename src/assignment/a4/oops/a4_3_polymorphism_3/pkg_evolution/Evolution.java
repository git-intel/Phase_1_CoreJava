package assignment.a4.oops.a4_3_polymorphism_3.pkg_evolution;
abstract class Monkey {
	abstract public  void jump();
	abstract public  void bite();
}
interface Animal{  
	void eat(); 
	void sleep();
}  
class Human extends Monkey implements Animal {
	public void eat() {
		System.out.println("Human: @Eat().");
	}
	public void sleep() {
		System.out.println("Human: @sleep().");
	}
	public void jump() {
		System.out.println("Human: @jump().");
	}
	public void bite() {
		System.out.println("Human: @bite().");
	}
}

public class Evolution {
	public static void main(String[] args) {
		Monkey M = new Human();
		M.jump();
		M.bite();
		((Animal) M).eat();
		((Animal) M).sleep();
	}
}
