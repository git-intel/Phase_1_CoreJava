package basic.inheritance;

class Teacher{
	private String designation = "Teacher";
	private String collageName = "BeginnersBook";
	
	public String getDesignation() {
		return designation;
	}
	
	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	protected String getCollageName() {
		return collageName;
	}
	protected void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	void does() {
		System.out.println("Teaching");
	}
}
public class SingleInheritance extends Teacher{
	String mainSubject = "Physics";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj = new SingleInheritance();
		System.out.println(obj.getCollageName());
	}

}
