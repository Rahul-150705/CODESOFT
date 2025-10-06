package grading;
import java.util.*;
public class Operations{
	Scanner sc=new Scanner(System.in);
	private ArrayList<Grading> grade=new ArrayList<>();
	private HashSet<Integer> set=new HashSet<>();
	public void displayall()
	{
	for(Grading grad:grade)
	{
		int mark=grad.getTotalmark();
		System.out.println("Roll no:"+ grad.getRollno()+" Name:"+grad.getName()+" Mark:"+grad.getTotalmark()+" Avg-Mark:"+grad.getTotalmark()/grad.getTotalsubject());
		grade(mark);
		System.out.println();
		System.out.println();
	}
	}
	public void addstudent1(int roll,String name,int totalsubject,int totalmark)  
	{
			if(set.contains(roll)) // to avoid duplicate evtry of roll no
			{
				System.out.println("Duplicate");
				
			}
			else
			{
				grade.add(new Grading(roll,name,totalsubject,totalmark));
				set.add(roll);
			}
	}
	public void getStudent(int id)
	{
		for(Grading student:grade)
		{
			if(student.getRollno()==id)
			{
				
				System.out.println("Roll no:"+student.getRollno()+" Name:"+student.getName()+" Total-Mark:"+student.getTotalmark()+" Avg-Mark:"+student.getTotalmark()/student.getTotalsubject());
			int mark=student.getTotalmark();
			grade(mark);
			}
			}
		}
	public void grade(int mark)
	{
		if(mark>=90) System.out.println("Grade:A+");
		else if(mark<90 && mark>=80) System.out.println("Grade:B");
		else if(mark<80 && mark>60) System.out.println("Grade:C");
		else if(mark<60) System.out.println("Grade:Fail");
	}
	public int marks(int n) {
		int totalmark=0;
		System.out.println("Enter"+n+" Subject Mark:");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Subject"+i+":");
			int EachMark=sc.nextInt();
			totalmark+=EachMark;
		}
		return totalmark;
		
	}

	}
