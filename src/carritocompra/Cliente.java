package carritocompra;

public abstract class Cliente {

    String dni;
    String nombre;
    String apellido;
    String codigo;
    Carrito carrito;

    public Cliente(String dni, String nombre, String apellido, String codigo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public abstract double calcularPuntos(double consumo);
}
