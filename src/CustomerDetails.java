import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerDetails extends JFrame implements ActionListener {

    private JTable t1;
    private JButton b1;
    private String[] x = {"Customer name", "Meter number", "Address", "City", "State", "Email", "Phone"};
    private String[][] y = new String[40][8];
    int i = 0;
    int j = 0;

    public CustomerDetails() {
        super("Customer details");
        setSize(1200,650);
        setLocation(400,150);

        try {
            Conn c1 = new Conn();
            String s1 = "SELECT * FROM customer";
            ResultSet rs = c1.s.executeQuery(s1);
            while (rs.next()) {
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("meter");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("city");
                y[i][j++] = rs.getString("state");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("phone");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
        }catch (Exception e) {
            System.out.println(e);
        }

        b1 = new JButton("Print");
        add(b1, "South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            t1.print();
        }catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new CustomerDetails().setVisible(true);
    }
}
