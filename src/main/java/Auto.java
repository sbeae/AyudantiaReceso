
    public class Auto {

    private double velocidad;

        public Auto(){
        this.velocidad = 50;
    }


    public double getVelocidad () {
            try {
                return this.velocidad;
            }
            catch (NumberFormatException e) {
                System.out.println("Error NumberFormatException: El valor no se puede convertir a double");
                return 0;
            }
    }
}