import javax.swing.*;
import java.awt.event.*;

public class Lab11 {
    private JFrame frame;
    private JTextField fahrenheitField;
    private JTextField celsiusField;

    public static void main(String[] args) {
        Lab11 converter = new Lab11();
        converter.createUI();
    }

    private void createUI() {
        frame = new JFrame("Fahrenheit to Celsius Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 175);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel fahrenheitLabel = new JLabel("Fahrenheit");
        panel.add(fahrenheitLabel);
       
        fahrenheitField = new JTextField(8);
        panel.add(fahrenheitField);

       
        JLabel celsiusLabel = new JLabel("Celsius");
        panel.add(celsiusLabel);

        celsiusField = new JTextField(15);
        celsiusField.setEditable(false);
        panel.add(celsiusField);

        

        fahrenheitField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fahrenheitText = fahrenheitField.getText();
                double fahrenheit = Double.parseDouble(fahrenheitText);
                double celsius = (fahrenheit - 32) * (5.0 / 9.0);
                celsiusField.setText(Double.toString(celsius));
            }

            
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub

                String fahrenheitText = fahrenheitField.getText();
                double fahrenheit = Double.parseDouble(fahrenheitText);
                double celsius = (fahrenheit - 32) * (5.0 / 9.0);
                celsiusField.setText(Double.toString(celsius));
                
            }
        });

        frame.setVisible(true);
    }
}