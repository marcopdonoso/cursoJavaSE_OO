import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Marco Perez", "marcopdonoso@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        //Variable vs Objeto: Un vistazo a la memoria

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Eliane Elias", "eliane@gmail.com");
        System.out.println(patient);

    }
}
