package lib;

public class Work extends Library{

	public Work(int id, String title, int isAvailable) {
		super(id, title, isAvailable);
	}
	public void display()
	{
		System.out.println("Id:"+id + "  Title:"+title+ "  isAvailabe:"+isAvailable);
	}
	boolean found=false;
	public void borrow()
	{
		if(isAvailable==1)
		{
			isAvailable=0;
			System.out.println("Book Borrowed:"+title);
			found=true;			
		}
		if(found==false)
		{
			System.out.println("Book Not Availabe");
			
		}
	}
	public void returnbook()
	{
		if(isAvailable==0) {
			isAvailable=1;
			System.out.println("Thank You For Returning");
		}
		else
		{
			System.out.println("Book Not Borrowed");
		}
	}
}
