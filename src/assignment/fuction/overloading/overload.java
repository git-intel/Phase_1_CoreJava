package assignment.fuction.overloading;

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1: " + calculate(10,12));
		System.out.println("2: " + calculate(10.13f));
		System.out.println("3: " + calculate(10.5d, 2.5d));
	}
	public static int calculate(int a, int b) {
		return (a + b);
	}
	public static float calculate(float rad) {
		return (float)(3.14 * rad * rad);
	}
	public static int calculate(double width, double height) {
		return  ((int)(width)) * ((int)height);
	}
}
