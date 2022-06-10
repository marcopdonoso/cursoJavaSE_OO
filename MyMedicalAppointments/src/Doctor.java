import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

    private int id_availableAppointment;
    private Date date;
    private String time;
    //AvailableAppointment

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor...");
    }

    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}
