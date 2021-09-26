/**
 * 
 */
package basic;

/**
 * @author ajay
 *
 */
public class typecasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int i = 100;
				long l= i;
				System.out.print("int value:i: "+ i + " ");
				System.out.print("long value:l "+ l+"\n");
				
				int o=(int) l;
				System.out.print("int value:o "+ o + " ");
				
				char t=(char) i;
				System.out.print("char value:t "+ t+"\n");
				
				double d=190067566565868.00797578776565675;
				float r=(float) d;
				System.out.print("double value:d "+ d + " ");
				System.out.print("float value: r"+ r+"\n");
				
				
				double d2=1906756656565868.0079698477877;
				long l2=(long)d2;
				int i2=(int)l2;
				System.out.print("double value:d2 "+ d2+" ");
				System.out.print("long value: l2"+ l2+" ");
				System.out.print("int value: i2"+ i2+"\n");
				
				float f = l;
				System.out.print("float value: f"+ i2+"\n");
	}

}
