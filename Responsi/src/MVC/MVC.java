package MVC;

import Controller.Controller;
import Model.Model;
import View.*;

public class MVC {

    ViewHome viewHome= new ViewHome();
    ViewPinjam viewPinjam = new ViewPinjam();
    Model model = new Model();
    ViewTampil viewTampil = new ViewTampil();
    ViewAbout viewAbout = new ViewAbout();
    /*ViewEdit viewEdit = new ViewEdit();*/

    Controller controller = new Controller(viewHome,viewPinjam,model,viewTampil,viewAbout);
}