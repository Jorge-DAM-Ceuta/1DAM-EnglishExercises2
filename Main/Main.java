import java.sql.*;

public class Main {

	public static void main(String[] args) {
//Queries from exercise 8 
	//Query 10
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select name from Products;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Name"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
	
	//Query 11
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select name, price from Products;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Name") + " " + rs.getDouble("Price"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 12
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select name from Products where price<=200;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Name"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 13
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Products where price between 60 and 120;");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Code") + " " + rs.getString("Name") + " " + rs.getDouble("Price") + " " + rs.getInt("Manufacturer"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 14
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select name, price*100 as cents from Products;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Name") + " " + rs.getDouble("cents"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 15
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select avg(price) from Products;");
			
			while(rs.next()) {
				System.out.println(rs.getDouble("avg(price)"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 16
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select avg(price) from Products where Code=2;");
			
			while(rs.next()) {
				System.out.println(rs.getDouble("avg(price)"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 17
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select count(name) from Products where price>=180;");
			
			while(rs.next()) {
				System.out.println(rs.getDouble("count(name)"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
//Queries from exercise 9
	//Query 18
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select title from Movies;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Title"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/

	//Query 19
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select rating from Movies;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Rating"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 20
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Movies where rating is null;");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Code") + " " + rs.getString("Title") + " " + rs.getString("Rating"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
		
	//Query 21
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EnglishDAM", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select title from Movies;");
			
			while(rs.next()) {
				System.out.println(rs.getString("Title"));
			}
			con.close();
		}catch(Exception error) {
			System.out.println(error);
		}*/
	}
}
