package untitled.src.View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NorthPanel extends JPanel{

    public ArrayList<JTextField> fields = new ArrayList<>();

    public NorthPanel(){

        JTextField tf1;
        tf1 = new JTextField();
        fields.add(tf1);

        JLabel lb1;
        lb1 = new JLabel("Search: ");

        lb1.setForeground(Color.white);
        tf1.setColumns(15);

        add(lb1);
        add(tf1);



    }

}
