import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Ljqf6278!");
            s = c.createStatement();

            System.out.println("Connected to database successfully");

        }catch (Exception e) {
            System.out.println(e);
        }
    }

}
