package untitled.src.View;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class InitialFrame extends JFrame{

    private InitialPanel ip;

    public InitialFrame(){
        super("IST 242 - Table View");

        ip = new InitialPanel();

        add(ip);

        ip.setBackground(Color.blue);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(612, 480);

        setVisible(true);
    }

    public InitialPanel getIp(){
        return ip;
    }

    public void setIp(InitialPanel ip){
        this.ip = ip;
    }
}
