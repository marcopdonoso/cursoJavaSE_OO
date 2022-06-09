public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor...");
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}
