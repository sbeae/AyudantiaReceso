import java.util.Scanner;

public class Persona {

    private String nombre;
    private int destino;
    public void ingresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nombre: ");
        nombre = scanner.nextLine();
    }
    public void ingresarDestino(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el destino en cantidad de kilometros a recorrer: ");
        destino = scanner.nextInt();
    }


    public void mostrar() {
        ingresarNombre();
        ingresarDestino();
        ingresarVehiculo();
        System.out.println("Hola " + nombre + ", el tiempo de viaje aproximado para llegar a " + destino + " en " + vehículo + " es de: " + cantidad + " Minutos/Horas");
    }


}