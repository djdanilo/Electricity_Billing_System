import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Project extends JFrame implements ActionListener {
    private String meter;
    public Project(String meter, String person) {
        super("Electricity billing system");
        this.meter = meter;
        setSize(1920,1030);
        showGUI(person);
    }

    public void showGUI(String person) {
        ImageIcon ic = new ImageIcon("icon/elect1.jpg");
        Image i3 = ic.getImage().getScaledInstance(1900,950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);

        JMenuBar mb = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer details");
        JMenuItem m3 = new JMenuItem("Deposit details");
        JMenuItem m4 = new JMenuItem("Calculate bill");
        master.setForeground(Color.BLUE);

        Font f1 = new Font("monospaced", Font.PLAIN, 12);

        m1.setFont(f1);
        ImageIcon icon1 = new ImageIcon("icon/icon1.png");
        Image image1 = icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);

        m2.setFont(f1);
        ImageIcon icon2 = new ImageIcon("icon/icon2.png");
        Image image2 = icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);

        m3.setFont(f1);
        ImageIcon icon3 = new ImageIcon("icon/icon3.png");
        Image image3 = icon3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        m3.setBackground(Color.WHITE);

        m4.setFont(f1);
        ImageIcon icon5 = new ImageIcon("icon/icon5.png");
        Image image5 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m4.setIcon(new ImageIcon(image5));
        m4.setMnemonic('B');
        m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
        m4.setBackground(Color.WHITE);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);


        //----------------------------

        JMenu info = new JMenu("Information");
        JMenuItem info1 = new JMenuItem("Update information");
        JMenuItem info2 = new JMenuItem("View information");

        info.setForeground(Color.RED);

        info1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon41 = new ImageIcon("icon/icon4.png");
        Image image41 = icon41.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        info1.setIcon(new ImageIcon(image41));
        info1.setMnemonic('P');
        info1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        info1.setBackground(Color.WHITE);

        info2.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon42 = new ImageIcon("icon/icon6.png");
        Image image42 = icon42.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        info2.setIcon(new ImageIcon(image42));
        info2.setMnemonic('L');
        info2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
        info2.setBackground(Color.WHITE);

        info1.addActionListener(this);
        info2.addActionListener(this);


        //-----------------------------------------------

        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay bill");

        JMenuItem u3 = new JMenuItem("Bill details");
        user.setForeground(Color.RED);

        u1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon4 = new ImageIcon("icon/icon4.png");
        Image image4 = icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);

        u3.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon6 = new ImageIcon("icon/icon6.png");
        Image image6 = icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
        u3.setBackground(Color.WHITE);

        u1.addActionListener(this);
        u3.addActionListener(this);


        //-------------------------------------------------

        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate bill");
        report.setForeground(Color.BLUE);

        r1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon7 = new ImageIcon("icon/icon7.png");
        Image image7 = icon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);

        r1.addActionListener(this);

        //-------------------------------------------------

        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web browser");
        utility.setForeground(Color.RED);

        ut1.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon8 = new ImageIcon("icon/icon12.png");
        Image image8 = icon8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);

        ut2.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon9 = new ImageIcon("icon/icon9.png");
        Image image9 = icon9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);

        ut3.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon10 = new ImageIcon("icon/icon10.png");
        Image image10 = icon10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);

        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);


        //-----------------------------------------------------

        JMenu exit = new JMenu("Logout");
        JMenuItem ex = new JMenuItem("Logout");
        exit.setForeground(Color.BLUE);

        ex.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon11 = new ImageIcon("icon/icon11.png");
        Image image11 = icon11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        master.add(m1);
        master.add(m2);
        master.add(m3);
        master.add(m4);

        info.add(info1);
        info.add(info2);

        user.add(u1);
        user.add(u3);

        report.add(r1);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);

        if (person.equals("Admin")) {
            mb.add(master);
        }else {
            mb.add(info);
            mb.add(user);
            mb.add(report);
        }
        mb.add(utility);
        mb.add(exit);

        setJMenuBar(mb);

        setFont(new Font("Sans serif", Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("Customer details")) {
            new CustomerDetails().setVisible(true);
        }
        else if (msg.equals("New customer")) {
            new NewCustomer().setVisible(true);
        }
        else if (msg.equals("Calculate bills")) {
            new CalculateBill().setVisible(true);
        }
        else if(msg.equals("Pay bill")) {
            new PayBill(meter).setVisible(true);
        }
        else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e2) {
                System.out.println(e2);
            }
        }
        else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e3) {
                System.out.println(e3);
            }
        }
        else if (msg.equals("Web browser")) {
            try {
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            }catch (Exception e4) {
                System.out.println(e4);
            }
        }
        else if (msg.equals("Logout")) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
        else if (msg.equals("Generate bill")) {
            new GenerateBill(meter).setVisible(true);
        }
        else if (msg.equals("Deposit details")) {
            new DepositDetails().setVisible(true);
        }
        else if(msg.equals("View information")) {
            new ViewInformation(meter).setVisible(true);
        }
        else if(msg.equals("Update information")) {
            new UpdateInformation(meter).setVisible(true);
        }
        else if(msg.equals("Bill details")) {
            new BillDetails(meter).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Project("","").setVisible(true);
    }
}
