import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About extends JFrame {

    private JButton b1;
    private JLabel lb1;
    private Font f, f1, f2;
    private TextArea t1;
    private String s1;

    public About() {
        setLayout(null);
        setTitle("About");
        showGUI();
        addListeners();

    }

    public void showGUI() {
        b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);

        f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s1 = """
                                       About Project                                                      Electricity billing system is a software-based application developed in Java programming language. The project aims at serving the department of electricity by computerizing the billing system. It mainly focuses on the calculation of Units consumed during the specified time and money to be paid to electricity offices. This computerized system will make the overall billing system easy, accessible, comfortable and effective for consumers.
                                       
                                       

                """;

        t1 = new TextArea(s1, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);

        add(t1);

        f1 = new Font("RALEWAY", Font.BOLD,16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        lb1 = new JLabel("About project");
        add(lb1);
        lb1.setBounds(170,10,180,80);
        lb1.setForeground(Color.RED);

        f2 = new Font("RALEWAY", Font.BOLD, 20);
        lb1.setFont(f2);

        setBounds(700,220,500,550);

        setLayout(null);
        setVisible(true);
    }

    public void addListeners() {
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new About();
    }

}
