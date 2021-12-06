package untitled.src.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralUI extends JFrame{
    private JButton searchShoesButton;
    private JButton searchBootsButton;
    private JButton changeFootMeasurementsButton;
    private JButton changeAccountInformationButton;
    private JPanel CentralUI;
    private AccountUI au;

    public CentralUI(){
        setContentPane(CentralUI);
        setTitle("Main Page");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        au = new AccountUI();

        changeAccountInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                au.setVisible(true);
            }
        });
    }
}
