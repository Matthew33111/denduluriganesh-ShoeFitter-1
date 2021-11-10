package untitled.src.View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;


public class CenterPanel extends JPanel {
    private NorthPanel np;
    public ArrayList<JButton> headers = new ArrayList<>();
    public ArrayList<JButton> tables = new ArrayList<>();

    public CenterPanel() {
        super();

        setVisible(true);
        setBackground(Color.red);
    }
}
