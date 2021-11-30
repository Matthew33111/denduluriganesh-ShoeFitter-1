package untitled.src.View;

import javax.swing.*;
import untitled.src.Controller.Controller;
public class MainFrame extends JFrame{
    private JPanel mainPanel;
    private JLabel MainPage;
    private JButton userLoginButton;
    private JButton registerNewUserButton1;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Main Page");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
