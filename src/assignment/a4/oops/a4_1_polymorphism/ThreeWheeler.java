/**
 * 
 */
package assignment.a4.oops.a4_1_polymorphism;

public class ThreeWheeler extends vehicle {

	int speed;
	long distance;
	int nos_of_tyre;
	
	public ThreeWheeler() {
		super();
		speed = 15;
		distance = 30l;
		nos_of_tyre = 3;
	}

	/**
	 * @param speed
	 * @param distance
	 */
	public ThreeWheeler(int speed, long distance,int nos_of_tyre) {
		super(speed, distance);
		this.speed = speed;
		this.distance = distance;
		this.nos_of_tyre = nos_of_tyre;
	}

	@Override
	public void run() {
		System.out.println("\n" + "Starting Three Wheeler!!" +"\n");
	}

	@Override
	public void stop() {
		System.out.println("\n" + "Stopping Three Wheeler!!" +"\n");
	}
	
	public void display() {
		System.out.println("\n"
				+ "Display() in class TwoWheeler"
				+ "\n"		
				+ "ThreeWheeler variables: \n"
				+ "speed:" + this.speed + "\n"
				+ "distance" + this.distance + "\n"
				+ "nos_of_tyre" + this.nos_of_tyre + "\n"
				+ "\n"
				+ "Super class variables: \n"
				+ "speed:" + super.speed + "\n"
				+ "distance" + super.distance + "\n"
				);

	}
	
}
