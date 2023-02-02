import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Dimension;

public class Lab14 extends JFrame {

    public static void main(String[] args) {
        Lab14 gui = new Lab14();
        gui.lastGuiLab();
    }


    public void lastGuiLab() {
        

        JFrame frame = new JFrame("Printer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,300);
        frame.setVisible(true);


        JPanel panel = new JPanel();

        frame.add(panel);

        
        JLabel L1 = new JLabel("Printer: MyPrinter");
        L1.setEnabled(false);
        panel.add(L1);

        JTextField t1 = new JTextField(5);
        t1.setPreferredSize(new Dimension(125,80));              
        panel.add(t1);


        JCheckBox checkBox1 = new JCheckBox("Image");
        panel.add(checkBox1);

        JCheckBox checkBox2 = new JCheckBox("Text");
        panel.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox("Code");
        panel.add(checkBox3);

        JTextField t2 = new JTextField(5);
        t2.setPreferredSize(new Dimension(125,80));              
        panel.add(t2);


        JRadioButton radio1 = new JRadioButton("Selection");
        panel.add(radio1);

        JRadioButton radio2 = new JRadioButton("All");
        panel.add(radio2);

        JRadioButton radio3 = new JRadioButton("Applet");
        panel.add(radio3);

        JTextField t3 = new JTextField(5);
        t3.setPreferredSize(new Dimension(125,80));              
        panel.add(t3);


        JButton b1 = new JButton("Ok");
        panel.add(b1);

        JButton b2 = new JButton("Cancel");
        panel.add(b2);

        JButton b3 = new JButton("Setup.....");
        panel.add(b3);

        JButton b4 = new JButton("Help");
        panel.add(b4);

        JLabel L2 = new JLabel("Print Quality:");
        L2.setEnabled(false);
        panel.add(L2);

        
        String[] quality = {"High", "Medium", "Low"};


        final JComboBox<String> dropdn = new JComboBox<String>(quality);
        
        dropdn.setMaximumSize(dropdn.getPreferredSize());
        dropdn.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(dropdn);

        JCheckBox print = new JCheckBox("Print to File");
        panel.add(print);
    }
}