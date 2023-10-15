public class Motocicleta {

    private double velocidad;

    public Motocicleta(){
        this.velocidad = 65;
    }

    public double getVelocidad() {

        try {
            return this.velocidad;
        }
        catch (NumberFormatException e) {
            System.out.println("Error NumberFormatException: El valor no se puede convertir a double");
            return 0;
        }
    }

}