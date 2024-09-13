import java.util.ArrayList;

public class Inventario {

    public ArrayList<Producto> listaPoductos = new ArrayList<Producto>();

    public void registrarProductos(Producto producto) {
        this.listaPoductos.add(producto);
        System.out.println("Se registro un nuevo Producto");
    }
    public void eliminarProducto(int idProductoEliminar) {
        int longitudOrignal = this.listaPoductos.size();

        this.listaPoductos.removeIf((producto -> producto.getId() == idProductoEliminar));

        if (longitudOrignal != this.listaPoductos.size()){
            System.out.println("\nSe elimino el producto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("\nNo existe el producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n** PRODUCTOS EN EL SISTEMA **");

        if (this.listaPoductos.size() == 0){
            System.out.println("\nNo esxiste productos registrados");
        } else {

            for (Producto producto : this.listaPoductos) {
                System.out.println(producto.mostrarProductos());
            }

        }

    }
}
