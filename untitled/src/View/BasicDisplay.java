package untitled.src.View;

import javax.swing.*;
import java.util.ArrayList;
public class BasicDisplay{
    JFrame frame;
    JPanel panel;
    JTextField textfield;
    JButton[] confirmationButton = new JButton[1];


    public void display(ArrayList<String> Name, ArrayList<String> Attribute) {
        frame = new JFrame("ShoeFitter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 650);
        frame.setLayout(null);

        int height = 15;
        for (int a = 0; a < Attribute.size(); ++a) {
            height += 70;
            textfield = new JTextField();
            textfield.setBounds(50, height, 200, 20);
            textfield.setText(Name.get(a));
            textfield.setEditable(false);
            frame.add(textfield);

            textfield = new JTextField();
            textfield.setBounds(50, height + 25, 200, 20);
            textfield.setText(Attribute.get(a));
            textfield.setEditable(false);
            frame.add(textfield);
            frame.setVisible(true);
        }
    }
}
