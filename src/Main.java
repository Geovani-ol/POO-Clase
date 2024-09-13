import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("1.- Registrar Productos");
            System.out.println("2.- Eliminar Producto");
            System.out.println("3.- Mostrar Productos");
            System.out.println("4.- Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion){

                case 1:
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.print("\nIngresa el Nombre del producto: ");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.print("\nIngresa el Precio del producto: ");
                    Double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.print("\nIngresa la Descrippción del producto: ");
                    String descipcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.print("\nIngresa el Categoría del producto: ");
                    String categoria = scanner.nextLine();

                    scanner.nextLine();

                    System.out.print("\nIngresa el Stock del producto: ");
                    int stock = scanner.nextInt();

                    Producto producto = new Producto(nombre,precio, descipcion, categoria, stock);
                    inventario.registrarProductos(producto);

                    break;

                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.print("\nIngresa el ID del producto:");
                    int id = scanner.nextInt();

                    break;

                case 3:
                    inventario.mostrarProductos();
                    break;

                case 4:
                    System.out.println("\nHata luego");
                    return;

            }
        }

    }

}