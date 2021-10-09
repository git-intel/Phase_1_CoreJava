/**
 * 
 */
package assignment.a5.exception_handling.a5_1_nested_try;

/**
 * @author Ajay
 * 
 */
public class ArithArrayException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			firstMethod();
			SecondMethod();
		} catch (Exception e) {
			System.out.println("main catch block");
		} finally {
			System.out.println("outter Finally");
		}
	}
	public static void firstMethod() {
		try {
			int res = 10/0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occured");
		} finally {
			System.out.println("firstMethod occured Finally block");
		}
	}
	public static void SecondMethod() {
		try {
			int[] res = {1, 2, 3, 4, 5, 6, 7};
			res[11]= 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
		} finally {
			System.out.println("SecondMethod occured Finally block");
		}
	}
}
