import java.util.Scanner;
public class Main {
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
                ingresarNombre();
                ingresarDestino();
                mostrar();
                break;
            case 2:
                Motocicleta moto = new Motocicleta();
                moto.mostrar();
                break;
            case 3:
                Bicicleta bici = new Bicicleta();
                bici.mostrar();
                break;
            case 4:
                System.out.println("Gracias por utilizar el programa");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
