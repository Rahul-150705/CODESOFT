package Student;
import java.util.*;
public class Main {
	public static void main (String[] args)
	{
		StudentData data=new StudentData();
		System.out.println("CHOOSE OPTION");
		System.out.println("1.Insert");
		System.out.println("2.Display");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			System.out.println("Enter Total Mark");
			int mark=sc.nextInt();
			Student s1=new Student(id,name,mark);
			data.insert(s1);
		}
		if(choice==2)
		{
			System.out.println("Enter Id to Search");
			int id = sc.nextInt();
			data.search(id);
			
		}
		sc.close();
	}

}
