public class Producto {

    public int id;
    public String nombre;
    public Double precio;
    public String descripcion;
    public String categoria;
    public int stock;

    public Producto(int id, String nombre, Double precio, String descripcion, String categoria, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public String mostrarProductos() {
        // d - enteros s - string f - double
        return String.format("Id: %d, Nombre: %s, Precio: %f, Descripcion: %s, Categoria: %s, Stock: %d",
                id,
                nombre,
                precio,
                descripcion,
                categoria,
                stock);
    }

}
