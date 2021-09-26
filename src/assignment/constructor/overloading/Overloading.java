package assignment.constructor.overloading;
//Assignment_3_26-spt-21_constructor_overloading
/*
 * Assignment 3: create the 4 student objects with name s1,s2,s3,s4

- 	declare the class member variables with String name, int age,
 	section(char type), gender (char type), and three int subject marks 
 	(subject1, subject 2, subject 3).
	Calcuate the total marks and percentage obtained by every student 
	(total= subject 1 + subject 2+ subject 3) by passing the values from the parameterized constructor. and for s2 and s3 stduents we will not pass subject 1 marks so it is 0 so dont pass it in constructor.
 * */
 
public class Overloading {
	String name;
	int age;
	char section;
	char gender;
	int subject1, subject2, subject3;
	public Overloading(String name,int age, char section, char gender, 
			int mark1, int mark2, int mark3) {
		this.name =name;
		this.age = age;
		this.section =section;
		this.gender = gender;
		subject1 = mark1;
		subject2 = mark2;
		subject3 = mark3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading s1 = new Overloading("leo",10,'A','M',100,60,70);
		Overloading s2 = new Overloading("john",11,'B','M',0,90,80);
		Overloading s3 = new Overloading("Ann",10,'A','F',0,80,100);
		Overloading s4 = new Overloading("ash",12,'B','M',10,20,30);
		
		s1.calculate();
		s2.calculate();
		s3.calculate();
		s4.calculate();
		
		
	}
	public void calculate() {
		System.out.print("Name: "+ name + " age:"+ age + ' ' + " section:" + section +" gender:" + gender);
		System.out.println("\nTotal Marks: "+ (subject1 + subject2 + subject3));
		System.out.println("Total percentile: "+ 
		(float)((subject1 + subject2 + subject3)/3) + "\n");
	}

}
