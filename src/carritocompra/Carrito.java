package carritocompra;

import java.util.ArrayList;

public class Carrito {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    public double calcularTotalPagar() {
        double totalPagar = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto prod = listaProductos.get(i);
            totalPagar += prod.getPrecio() * prod.getCantidad();
        }
        return totalPagar;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProductos(Producto prod) {
        listaProductos.add(prod);
    }

    public void eliminarProducto(int indice) {
        listaProductos.remove(indice);
    }
}
