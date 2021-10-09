package assignment.a4.oops.a4_1_polymorphism;

public abstract class vehicle {
	int speed;
	long distance;
	
	public vehicle() {
		speed = 0;
		distance = 0l;
	}
	public vehicle(int speed, long distance) {
		this.speed = speed;
		this.distance = distance;
	}

	
	public abstract void run();
	public abstract void stop();
	
	public static void main(String[] args) {
	
		vehicle v = new TwoWheeler(20, 70, 2);
		v.run();
		((TwoWheeler) v).display();
		v.stop();
		v = new ThreeWheeler(30, 70, 3);
		v.run();
		((ThreeWheeler) v).display();
		v.stop();
		v = new FourWheeler(40, 70, 3);
		v.run();
		((FourWheeler) v).display();
		v.stop();
		v = new EightWheeler(80, 70, 3);
		v.run();
		((EightWheeler) v).display();
		v.stop();

	}
	public void fuel(int p1) {
		
	}
	public void fuel(float p1, String p2) {
		
	}
	public void fuel(char p1, int p2) {
		
	}
//	/**
//	 * @return the speed
//	 */
//	public int getSpeed() {
//		return speed;
//	}
//	/**
//	 * @param speed the speed to set
//	 */
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	/**
//	 * @return the distance
//	 */
//	public long getDistance() {
//		return distance;
//	}
//	/**
//	 * @param distance the distance to set
//	 */
//	public void setDistance(long distance) {
//		this.distance = distance;
//	}

	
}
