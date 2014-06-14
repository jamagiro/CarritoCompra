package carritocompra;

public class ClienteNormal extends Cliente {

    public ClienteNormal(String dni, String nombre, String apellido, String codigo) {
        super(dni, nombre, apellido, codigo);
    }

    @Override
    public double calcularPuntos(double consumo) {
        double puntos = 0;
        if (consumo > 600) {
            puntos = consumo - (0.1 * consumo / 300);
        }
        return puntos;

    }

}
