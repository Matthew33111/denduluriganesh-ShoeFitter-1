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
    private FootUI fu;
    private BootUI bu;
    private ShoeUI su;


    public CentralUI(){
        setContentPane(CentralUI);
        setTitle("Main Page");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        au = new AccountUI();
        fu = new FootUI();
        bu = new BootUI();
        su = new ShoeUI();


        changeAccountInformationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                au.setVisible(true);
            }
        });

        searchShoesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                su.setVisible(true);
            }
        });

        searchBootsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bu.setVisible(true);
            }
        });

        changeFootMeasurementsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fu.setVisible(true);
            }
        });
    }
}
