import java.util.Scanner;

public class Persona {

    private String nombre;
    private int destino;
    public void ingresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nombre: ");
        this.nombre = scanner.nextLine();
    }
    public void ingresarDestino(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el destino en cantidad de kilometros a recorrer: ");
        this.destino = scanner.nextInt();
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getDestino() {
        return this.destino;
    }





}