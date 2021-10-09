package assignment.a4.oops.a4_1_polymorphism;

public abstract class vehicle {

	public vehicle() {
		setSpeed(0);
		setDistance(0l);
	}
	public vehicle(int speed, long distance) {
		this.setSpeed(speed);
		this.setDistance(distance);
	}
	private int speed;
	private long distance;
	
	public abstract String run();
	public abstract String stop();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void fuel(int p1) {
		
	}
	public void fuel(float p1, String p2) {
		
	}
	public void fuel(char p1, int p2) {
		
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the distance
	 */
	public long getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(long distance) {
		this.distance = distance;
	}

	
}
