import java.util.Scanner;
public class Main {

    private String vehiculo;
    public Main() {
        menu();
    }
    public void menu(){
        int opcion;
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");
        System.out.println("4. Salir");
        System.out.println("Ingrese el vehiculo que se va a utilizar: ");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                this.vehiculo="Auto";
                Persona persona = new Persona();
                Auto auto = new Auto();

                auto.getVelocidad();
                persona.ingresarNombre();
                persona.ingresarDestino();
                System.out.println("Hola " + persona.getNombre() + ", el tiempo de viaje aproximado para llegar a " + persona.getDestino() + " kilometros en auto es de: " + persona.getDestino() / auto.getVelocidad() + " Horas");

                break;

            case 2:
                this.vehiculo="Moto";
                Persona persona2 = new Persona();
                Motocicleta motocicleta = new Motocicleta();
                persona2.ingresarNombre();
                persona2.ingresarDestino();

                System.out.println("Hola " + persona2.getNombre() + ", el tiempo de viaje aproximado para llegar a " + persona2.getDestino() + " kilometros en moto es de: " + persona2.getDestino()/motocicleta.getVelocidad() + " Horas");

                break;

            case 3:
                this.vehiculo="Bicicleta";
                Persona persona3 = new Persona();
                Bicicleta bicicleta = new Bicicleta();

                persona3.ingresarNombre();
                persona3.ingresarDestino();
                System.out.println("Hola " + persona3.getNombre() + ", el tiempo de viaje aproximado para llegar a " + persona3.getDestino() + " kilometros en bicicleta es de: " + persona3.getDestino()/bicicleta.getVelocidad() + " Horas");

                break;

            case 4:
                System.out.println("Gracias por utilizar el programa");
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    public static void main(String[] args) {
        new Main();
    }


}
