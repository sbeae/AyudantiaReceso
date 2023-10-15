import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private double destino;
    public void ingresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nombre: ");
        this.nombre = scanner.nextLine();
    }
    public void ingresarDestino(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el destino en cantidad de kilometros a recorrer: ");
            this.destino = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Error InputMismatchException: El valor no se puede convertir a String");
        }
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getDestino() {
        return this.destino;
    }





}