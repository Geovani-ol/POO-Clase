public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto producto1 = new Producto(1, "Iphone 16 Pro Max", 31000.00, "Nuevo Iphone", "Iphone", 15);
        Producto producto2 = new Producto(2, "Iphone 15 Pro Max", 28000.00, "Antiguo Iphone", "Iphone", 250);
        Producto producto3 = new Producto(3, "Iphone 14 Pro Max", 21000.00, "Antiguo Iphone", "Iphone", 500);

        inventario.registrarProductos(producto1);
        inventario.registrarProductos(producto2);
        inventario.registrarProductos(producto3);

        inventario.mostrarProductos();

        inventario.eliminarProducto(3);

        inventario.mostrarProductos();

    }

}