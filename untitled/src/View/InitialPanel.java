package untitled.src.View;

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel{

    private CenterPanel cp;
    private NorthPanel np;

    public InitialPanel(){
        super();
        cp = new CenterPanel();
        np = new NorthPanel();

        setLayout(new BorderLayout());
        cp.setBackground(Color.yellow);
        np.setBackground(Color.GRAY);

        add(np, "North");
        add(cp, "Center");
    }

    public CenterPanel getCp(){
        return cp;
    }

    public void setCp(CenterPanel cp){
        this.cp = cp;
    }

    public NorthPanel getNp(){
        return np;
    }

    public void setNp(NorthPanel np){
        this.np = np;
    }
}
