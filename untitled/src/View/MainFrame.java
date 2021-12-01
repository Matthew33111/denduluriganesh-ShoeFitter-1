package untitled.src.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import untitled.src.Controller.Controller;
import untitled.src.Model.Customer;
import untitled.src.View.LoginUI;

public class MainFrame extends JFrame{
    private JPanel mainPanel;
    private JLabel MainPage;
    private JButton userLoginButton;
    private JButton registerNewUserButton1;
    private LoginUI theLoginUI;
    private RegisterUI ru;
    private LoginUI lu;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Main Page");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ru = new RegisterUI();
        //lu = new LoginUI();


    }
}
