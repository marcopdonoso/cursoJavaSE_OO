import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Wilmer Mendez";
        myDoctor.showName();
        System.out.println("Estado actual del ID: " + Doctor.id);

        Doctor myDoctorMarco = new Doctor();
        myDoctorMarco.name = "Marco Perez Donoso";
        System.out.println("Estado actual del ID: " + Doctor.id);

        showMenu();
    }
}
