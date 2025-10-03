package lib;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Work> library=new ArrayList<>();
		library.add(new Work(1, "Harry Potter", 1));
		library.add(new Work(2, "The Hobbit", 1));
		library.add(new Work(3, "Java Basics", 1));
		library.add(new Work(4, "OOP Concepts", 1));
		library.add(new Work(5, "Data Structures", 1));
		library.add(new Work(6, "Design Patterns", 1));
		library.add(new Work(7, "Clean Code", 1));
		library.add(new Work(8, "Effective Java", 1));
		library.add(new Work(9, "Algorithms Unlocked", 1));
		library.add(new Work(10, "The Pragmatic Programmer", 1));
		boolean loop=true;
		while(loop==true)
		{
			System.out.println("1. Show All Books");
		    System.out.println("2. Borrow a Book");
		    System.out.println("3. Return a Book");
		    System.out.println("4. Exit");
		    System.out.print("Enter your choice: ");
		    int choice = sc.nextInt();
		    if(choice==1)
		    {
		    	System.out.println("--------------------------------------BOOKS AVAILABE-----------------------------------");
				for(Work book:library)
				{
					book.display();
				}
		    }
		    else if (choice==2)
		    {
		    	System.out.print("Enter Book To Borrow:");
		    	sc.nextLine();
				String borrow=sc.nextLine();
				boolean x=false;
				for(Work book:library)
				{
					if(book.title.equalsIgnoreCase(borrow))
					{
						book.borrow();
						x=true;
						break;
						
					}
				}
				if(x==false)
				{
					System.out.println("Book Not Availabe");
					System.out.println();
				}
		    }
		    else if(choice==3)
		    {
		    	System.out.println("Enter Book to Return:");
		    	sc.nextLine();
				String returnbook=sc.nextLine();
				boolean dound=false;
				for(Work book :library)
				{
					if(book.title.equalsIgnoreCase(returnbook))
					{
						book.returnbook();
						dound=true;
						break;
					}
					
				}
				if(dound==false)
				{
					System.out.println("Wrong Title");
				}
		    }
		    else if (choice==4)
		    {
		    	loop=false;
		    }
		    else
		    {
		    	System.out.println("Choose Correct Option");
		    }
		}
		sc.close();
	}

}
