package untitled.src;

import untitled.src.Controller.Controller;
import untitled.src.View.View;
import untitled.src.Model.Model;

public class App {
    public static void main(String[] args){

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

    }
}
