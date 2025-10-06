package grading;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operations op=new Operations();
		boolean found=true;
		while(found==true) {
			System.out.println("1.Add Student:");
			System.out.println("2.Display All");
			System.out.println("3.Display By Id");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter RollNo:");
			int roll=sc.nextInt();
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter Total Subject");
			int n=sc.nextInt();
			int total=op.marks(n);
			System.out.println("Total Mark:"+total);
			System.out.println("Avg Mark:"+total/n);
			op.grade(total/n);
			op.addstudent1(roll,name,n,total);
			
		}
		else if(choice==3)
		{
			System.out.println("Enter student id:");
			int id1=sc.nextInt();
			op.getStudent(id1);
		}
		else if(choice==2)
		{
			op.displayall();
		}
		else if(choice==4)
		{
			System.out.println("Thank You");
			found=false;
			sc.close();
		}
		else
		{
			System.out.println("Invalid Choice...");
		}
		}
	}

}
