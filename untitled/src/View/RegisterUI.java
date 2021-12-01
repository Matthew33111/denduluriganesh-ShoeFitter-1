package untitled.src.View;

import javax.swing.*;
import untitled.src.Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPasswordField passwordField1;
    private JButton registerUserButton;
    private JButton cancelButton;
    private JPanel RegisterPanel;

    public RegisterUI() {
        setContentPane(RegisterPanel);
        setTitle("Registration");
        setSize(500, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}
