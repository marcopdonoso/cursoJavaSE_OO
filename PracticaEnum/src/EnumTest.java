public class EnumTest {
    public enum Objects {
        TAZA("Blanco", "Estandar"),
        AUDIFONOS("Blanco", "Grandes"),
        RATON("Negro", "Mediano"),
        MESA("Marron", "Grande"),
        SILLA("Azul", "Estandar");

        private String color;
        private String size;
        private Objects(String c, String s){
            color = c;
            size = s;
        }

        public String getColor(){
            return color;
        }

        public String getSize(){
            return size;
        }
    }
}
