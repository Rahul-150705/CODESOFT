package Student;
import java.sql.Connection;
import java.sql.DriverManager; // to insert the data 
import java.sql.PreparedStatement;	// to insert the data 
import java.sql.SQLException; 
import java.sql.ResultSet; // to diplay
import java.sql.Statement;	// to display
public class StudentData {
	private static final String URL="jdbc:mysql://localhost:3306/student";
	private static final String USER= "root";
	private static final String PASSWORD="rahul18";
	public void insert(Student student)
	{
		String query ="insert into students(id,name,totalmark) values(?,?,?)";
		try(Connection conn=DriverManager.getConnection(URL,USER,PASSWORD);
				PreparedStatement pst=conn.prepareStatement(query)){
			pst.setInt(1, student.id);
			pst.setString(2, student.name);
			pst.setInt(3,student.totalmark);
			int rows=pst.executeUpdate();
			if(rows>0)
			{
				System.out.println("Inserted Successfully");
			}
		}
		catch(SQLException e)
		{
			 System.out.println("Error: " + e.getMessage());
			    e.printStackTrace();
		}
	}
	public void display()
	{
		String show="select * from students";
		 try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
				 Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(show)) {

	            System.out.println("ID\tName\t\tTotal Marks");
	            System.out.println("------------------------------------");

	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                int totalmark = rs.getInt("totalmark");

	                System.out.println(id + "\t" + name + "\t\t" + totalmark);
	            }
		 }
	                catch (SQLException e) {
	                    System.out.println("Error fetching data: " + e.getMessage());
	                    e.printStackTrace();
	                }
		}
	public void search(int id)
	{
		String search="select * from students where id= ? ";
		try(
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            PreparedStatement pstmt = conn.prepareStatement(search);
		){
			 pstmt.setInt(1,id);
	            ResultSet rs = pstmt.executeQuery();
	            
	            if (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id"));
	                System.out.println("Name: " + rs.getString("name"));
	                System.out.println("Marks: " + rs.getInt("totalmark"));
	            } else {
	                System.out.println("No student found with ID " + id);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
	}
