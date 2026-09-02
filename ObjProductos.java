public class ObjProductos {

    private String Nombre;
    private Double Peso;
    private Double Precio;
    private int Categoria;

    public ObjProductos() {
    }

    public ObjProductos(String nombre, Double peso, Double precio, int categoria) {
        Nombre = nombre;
        Peso = peso;
        Precio = precio;
        Categoria = categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int categoria) {
        Categoria = categoria;
    }

   

    

    
    

}