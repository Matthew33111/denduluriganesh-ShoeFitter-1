package untitled.src.Controller;

import untitled.src.Model.Model;
import untitled.src.Model.TestHarness;
import untitled.src.View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller {
    Model model;
    View view;

    public Controller(View v, Model m) {
        model = m;
        view = v;

        TestHarness.TestHarness();
       // untitled.src.View.View.InitialSetUp();
    }
}
