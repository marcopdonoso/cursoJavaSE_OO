import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Marco Perez", "Cirujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        //Variable vs Objeto: Un vistazo a la memoria
        int i = 0;
        int b = 2;
        b = i;

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Sondo", "Gastro");
        Patient patient2 = new Patient("Druno", "Gineco");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        /*Patient patient = new Patient("Daniela Riera", "danirieraparedes@gmail.com");

        patient.setWeight(55);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/

    }
}
