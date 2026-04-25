import java.sql.*;

public class JDBCTemplate {
    public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );

            Statement stmt = con.createStatement();

            // Example: Create table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS employee(id INT, name VARCHAR(50), salary DOUBLE)");

            // INSERT
            stmt.executeUpdate("INSERT INTO employee VALUES(1,'Yash',35000)");

            // SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
            }

            // UPDATE
            stmt.executeUpdate("UPDATE employee SET salary = salary + 5000 WHERE id=1");

            // DELETE
            stmt.executeUpdate("DELETE FROM employee WHERE id=1");

            con.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}