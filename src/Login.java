import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener {

    private JLabel lb1, lb2, lb3, lb4;
    private JTextField tf1;
    private JPasswordField pf1;
    private JButton b1, b2, b3;
    private Choice c1;

    public Login() {
        super("Login page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        showGUI();
    }

    public void showGUI() {
        lb1 = new JLabel("Username");
        lb1.setBounds(300,20,100,20);
        add(lb1);

        lb2 = new JLabel("Password");
        lb2.setBounds(300,60,100,20);
        add(lb2);

        tf1 = new JTextField(15);
        tf1.setBounds(400,20,150,20);
        add(tf1);
        pf1 = new JPasswordField(15);
        pf1.setBounds(400,60,150,20);
        add(pf1);

        lb4 = new JLabel("Logging in as");
        lb4.setBounds(300,100,100,20);
        add(lb4);

        c1 = new Choice();
        c1.add("Admin");
        c1.add("Customer");
        c1.setBounds(400,100,150,20);
        add(c1);

        ImageIcon ic1 = new ImageIcon("icon/login.png");
        Image i1 = ic1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b1 = new JButton("Login", new ImageIcon(i1));
        b1.setBounds(330,160,100,20);
        add(b1);

        ImageIcon ic2 = new ImageIcon("icon/cancel.jpg");
        Image i2 = ic2.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b2 = new JButton("Cancel", new ImageIcon(i2));
        b2.setBounds(450,160,100,20);
        add(b2);

        ImageIcon ic4 = new ImageIcon("icon/signup.png");
        Image i4 = ic4.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        b3 = new JButton("Sign up", new ImageIcon(i4));
        b3.setBounds(380,200,130,20);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        ImageIcon ic3 = new ImageIcon("icon/second.jpg");
        Image i3 = ic3.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        lb3 = new JLabel(icc3);
        lb3.setBounds(0,0,250,250);
        add(lb3);

        setLayout(new BorderLayout());

        setSize(640,300);
        setLocation(600,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Conn c = new Conn();
                String a = tf1.getText();
                String b = pf1.getText();
                String user = c1.getSelectedItem();
                String q = "SELECT * FROM login WHERE username = '"+a+"' AND password = '"+b+"' AND user = '"+user+"'";
                ResultSet rs = c.s.executeQuery(q);
                if (rs.next()) {
                    String meter = rs.getString("meter_no");
                    new Project(meter, user).setVisible(true);
                    this.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    tf1.setText("");
                    pf1.setText("");
                }
            }catch (Exception e1) {
                System.out.println(e1);
            }
        }else if (e.getSource() == b2) {
            this.setVisible(false);
        }else if (e.getSource() == b3) {
            this.setVisible(false);
            new Signup().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
