package carritocompra;

import java.util.ArrayList;

public class Empresa {

    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public boolean agregarCliente(Cliente cliente) {
        boolean estado = true;
        if (listaClientes.size() == 0) {
            listaClientes.add(cliente);
        } else {

            for (int i = 0; i < listaClientes.size(); i++) {
                if (cliente.getCodigo().equals(listaClientes.get(i).getCodigo())) {
                    System.out.println("El código: " + cliente.getCodigo() + " ya se encuentra registrado!");
                    estado = false;
                    break;
                } else {

                    listaClientes.add(cliente);
                    estado = true;
                    break;
                }
            }
        }

        return estado;
    }
}
