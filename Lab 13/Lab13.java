import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Lab13 extends JFrame{

    public static void main(String[] args) {
        Lab13 gui = new Lab13();
        gui.guiFormat();
    }

     
    private void guiFormat() {
    JFrame frame = new JFrame("ColorSelect");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 175);
    frame.setVisible(true);
    
    
    JPanel panel = new JPanel();
   
  
    frame.add(panel);



    String[] colors = {"Red", "Blue", "Green"};


    final JComboBox<String> dropdn = new JComboBox<String>(colors);
    
    
    dropdn.setMaximumSize(dropdn.getPreferredSize());
    dropdn.setAlignmentX(CENTER_ALIGNMENT);
    panel.add(dropdn);


    JLabel label1 = new JLabel("Background");
    panel.add(label1);

    //checkbox
    JCheckBox box1 = new JCheckBox("");
    panel.add(box1);

    JLabel label2 = new JLabel("Foreground");
    panel.add(label2);

    //checkbox
    JCheckBox box2 = new JCheckBox("");
    panel.add(box2);

    
    JButton b1 = new JButton("Ok");
    panel.add(b1);

    
    JButton b2 = new JButton("Cancel");
    panel.add(b2);
    }
}



