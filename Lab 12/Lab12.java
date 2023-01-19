import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Lab12 extends JFrame {

    public Lab12(String title) {
        super(title);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        Lab12 show = new Lab12(null);
        show.make();
    }


    private void make() {
        JFrame frame = new JFrame("Align");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 200);
        frame.setVisible(true);



        JPanel panel = new JPanel();
        frame.add(panel);


        JLabel label1 = new JLabel("Snap to Grid");
        panel.add(label1);

        //checkbox
        JCheckBox box1 = new JCheckBox("");
        panel.add(box1);

        JLabel label2 = new JLabel("Show Grid");
        panel.add(label2);

        //checkbox
        JCheckBox box2 = new JCheckBox("");
        panel.add(box2);






        JLabel label3 = new JLabel("X:");
        panel.add(label3);

        //textfiled 
        JTextField t1 = new JTextField(3);
        panel.add(t1);


        JLabel label4 = new JLabel("Y:");
        panel.add(label4);


        JTextField t2 = new JTextField(3);
        panel.add(t2);


        JButton b1 = new JButton("Ok");
        panel.add(b1);

        
        JButton b2 = new JButton("Cancel");
        panel.add(b2);


        JButton b3 = new JButton("Help");
        panel.add(b3);
    }

}
