import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Marco Perez", "Cirujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
