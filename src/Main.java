import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        System.out.println("MENU DE SELECCION: ");
        System.out.println("1. Sistema de facturacion");
        System.out.println("2. Clasificacion de mascotas");
        System.out.println("3. Control de parqueadero");
        System.out.println("4. Promociones tienda ropa");
        System.out.println("Seleccione una opcion: ");
        opcion = scanner.nextInt();

        if (opcion == 1)
        {
            sistemaFacturacion();
        }

        else if (opcion == 2)
        {
            clasificarMascota();
        }

        else if (opcion == 3)
        {
            controlParqueadero();
        }

        else if (opcion == 4)
        {
            tiendaRopa();
        }

        else
        {
            System.out.println("Opcion no válida.");
        }
    }

    public static void sistemaFacturacion()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. Sistema de facturacion");

        System.out.print("Ingrese el valor total de la compra: ");
        double total = scanner.nextDouble();

        System.out.print("¿Cuantos productos adquirio?: ");
        int cantidad = scanner.nextInt();

        System.out.print("¿Tiene membresia? (si/no): ");
        String membresia = scanner.next().toLowerCase();

        double descuento = 0;

        if (membresia.equals("si"))
        {
            descuento = descuento + 0.10;  // descuento del 10%
        }

        if (cantidad > 10)
        {
            descuento = descuento + 0.05;  // descuento del 5%
        }

        double totalFinal = total - (total * descuento);

        System.out.println("Total final a pagar: " + totalFinal);
    }


    public static void clasificarMascota()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n2. Clasificacion de mascotas");

        System.out.print("Tipo de animal (perro, gato, ave, otro): ");
        String tipo = scanner.next().toLowerCase();

        System.out.print("Edad del animal: ");
        int edad = scanner.nextInt();

        String veterinario = "";
        boolean vacunaExtra = false;

        switch (tipo)
        {
            case "perro":
                veterinario = "veterinario canino";
                if (edad > 5)
                {
                    vacunaExtra = true;
                }
                break;

            case "gato":
                veterinario = "veterinario felino";
                if (edad > 5)
                {
                    vacunaExtra = true;
                }
                break;

            case "ave":
                veterinario = "veterinario de animales exóticos";
                break;

            default:
                veterinario = "veterinario general";
                break;
        }

        System.out.println("Veterinario asignado: " + veterinario);

        if (vacunaExtra == true)
        {
            System.out.println("Recomendacion: vacunacion adicional.");
        }
    }


    public static void controlParqueadero()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n3. Control de parqueadero");

        System.out.print("Tipo de vehiculo (carro, moto, bicicleta): ");
        String tipo = scanner.next().toLowerCase();

        System.out.print("Hora de llegada (0-23): ");
        int hora = scanner.nextInt();

        int costoBase = 0;

        if (tipo.equals("carro"))
        {
            costoBase = 5000;
        }

        else if (tipo.equals("moto"))
        {
            costoBase = 3000;
        }

        else if (tipo.equals("bicicleta"))
        {
            costoBase = 1000;
        }

        else
        {
            System.out.println("Tipo no válido.");
            return;
        }

        double total = costoBase;

        if (hora > 20)
        {
            total = total + (total * 0.20);
        }

        System.out.println("Costo total final: " + total);
    }


    public static void tiendaRopa()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n4. Tienda de ropa ");

        System.out.print("Tipo de prenda (camisa, pantalon, chaqueta): ");
        String prenda = scanner.next().toLowerCase();

        System.out.print("Cantidad a comprar: ");
        int cantidad = scanner.nextInt();

        int precioUnidad = 0;

        switch (prenda)
        {
            case "camisa":
                precioUnidad = 30000;
                break;

            case "pantalon":
                precioUnidad = 50000;
                break;

            case "chaqueta":
                precioUnidad = 80000;
                break;

            default:
                System.out.println("Prenda sin existencias actualmente.");
                return;
        }

        double total = precioUnidad * cantidad;

        if (cantidad > 5)
        {
            total = total - (total * 0.15);
        }

        System.out.println("Total a pagar: " + total);
    }
}
