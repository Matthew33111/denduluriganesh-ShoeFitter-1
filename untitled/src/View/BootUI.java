package untitled.src.View;

import javax.swing.*;

public class BootUI extends JFrame {

    private JPanel BootFrame;
    private JTable table1;

    public BootUI(){
        setContentPane(BootFrame);
        setTitle("Boots");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
