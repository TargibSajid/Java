import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

class Main
{
	public static void main(String [] args)
	{
		String url = "jdbc:mysql://localhost:3306/team";

		String username = "root";

		String password = "";


        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            

            
            Connection connection = DriverManager.getConnection(url, username, password);

            

            Statement statement = connection.createStatement();

            String query = "Select * from team;";

            ResultSet result = statement.executeQuery(query);

            while(result.next())
            {
            	int team_id;

            	String country;

            	String logo;

            	team_id = result.getInt("TEAM_ID");
            	country = result.getString("COUNTRY");
            	logo = result.getString("LOGO");


            	System.out.println(team_id +" "  + country + " " + logo);
            }

            connection.close();
            statement.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Mysql JDBC driver not found");
            
        } catch (SQLException e) {
            System.out.println("Connection failed");
            
        }
	}
}