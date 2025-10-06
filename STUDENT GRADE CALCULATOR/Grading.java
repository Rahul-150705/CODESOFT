package grading;
public class Grading {
	private int rollno;
	private String name;
	private int totalmark;
	private int totalsubject;
	public Grading(int rollno, String name, int totalsubject,int totalmark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.totalmark = totalmark;
		this.totalsubject = totalsubject;
	}

	public int getTotalsubject() {
		return totalsubject;
	}

	public void setTotalsubject(int totalsubject) {
		this.totalsubject = totalsubject;
	}

	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getTotalmark() {
		return totalmark;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotalmark(int mark) {
		this.totalmark = mark;
	}
	public void grade(int mark)
	{
		if(mark>=90) System.out.println("Grade:A+");
		else if(mark<90 && mark>=80) System.out.println("Grade:B");
		else if(mark<80 && mark>60) System.out.println("Grade:C");
		else if(mark<60) System.out.println("Grade:Fail");
	}
}
