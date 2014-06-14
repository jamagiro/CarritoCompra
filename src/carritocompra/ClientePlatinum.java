package carritocompra;

public class ClientePlatinum extends Cliente {

    public ClientePlatinum(String dni, String nombre, String apellido, String codigo) {
        super(dni, nombre, apellido, codigo);
    }

    @Override
    public double calcularPuntos(double consumo) {
        double puntos = 0;
        if (consumo > 800) {
            puntos = consumo - (0.1 * consumo / 100);
        }
        return puntos;
    }

}
