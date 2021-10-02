package assignment.constructor.shapes.area;

public class AreaOfShapes {
	double area;
	float p1,p2;
	String unitOfMeasurement;
	public AreaOfShapes() {
		// TODO Auto-generated constructor stub
		area = 0;
		p1=0;
		p2=0;
		unitOfMeasurement = "Square metre";
	}
	public AreaOfShapes(float p1) {
		// TODO Auto-generated constructor stub
		area = 0;
		this.p1= p1;
		p2=0;
		unitOfMeasurement = "Square metre";
	}
	
	public AreaOfShapes(float p1, float p2) {
		// TODO Auto-generated constructor stub
		area = 0;
		this.p1= p1;
		this.p2= p2;
		unitOfMeasurement = "Square metre";
	}
	public AreaOfShapes(float p1, float p2, String unitOfMeasurement ) {
		// TODO Auto-generated constructor stub
		area = 0;
		this.p1= p1;
		this.p2= p2;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShapes square = new AreaOfShapes(10.0f);
		AreaOfShapes rectangle = new AreaOfShapes(10.0f,20.0f);
		AreaOfShapes circle = new AreaOfShapes(10.0f);
		AreaOfShapes rhombus = new AreaOfShapes(10.0f, 15.0f);
		AreaOfShapes triangle = new AreaOfShapes(10.0f, 15.0f);
		
		
		square.calculateSquareArea();
		rectangle.calculateRectangleArea();
		circle.calculateCircleArea();
		rhombus.calculateSquareArea("rhombus");
		triangle.calculateSquareArea("triangle");
	}
	public void calculateSquareArea() {
		area = p1 * p1;
		System.out.println("side of square: "+ p1);
		System.out.println("area of square: "+ area + ' ' + unitOfMeasurement + "\n\n");
	}
	public void calculateRectangleArea() {
		area = p1 * p2;
		System.out.println("l & b  of rectangle: "+ p1 + " & " + p2);
		System.out.println("area of rectangle: "+ area + ' ' + unitOfMeasurement + "\n\n");
	}
	public void calculateCircleArea() {
		area = 3.14159 * p1 * p1;
		System.out.println("radius of square: "+ p1);
		System.out.println("area of square: "+ area + ' ' + unitOfMeasurement+ "\n\n");
	}
	public void calculateSquareArea(String nameOfShape) {
		area = p1 * p1 / 2;
		switch(nameOfShape) {
		  case "rhombus":
			System.out.println("diagonals of rhombus: "+ p1 + " & " + p2);
			System.out.println("area of rhombus: "+ area + ' ' + unitOfMeasurement + "\n\n");
		    break;
		  case "triangle":
			System.out.println("height & base of triangle: "+ p1 + " & " + p2);
			System.out.println("area of triangle: "+ area + ' ' + unitOfMeasurement + "\n\n");
		    break;
		  default:
		}
		
	}
}
