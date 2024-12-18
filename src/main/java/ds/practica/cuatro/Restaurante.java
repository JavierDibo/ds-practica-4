package ds.practica.cuatro;

import java.util.*;

class Restaurante {
    private Usuario usuario;
    private final Map<Integer, Mesa> mesas = new HashMap<>();

    public Restaurante(int numMesas, int capacidadMesas) {

        if (numMesas <= 0 || capacidadMesas <= 0) {
            throw new IllegalArgumentException("El número de mesas y la capacidad de las mesas deben ser mayores que cero.");
        }

        int id = 0;

        for (int i = 0; i < numMesas; i++) {
            mesas.put(id, new Mesa(id, capacidadMesas));
            id++;
        }
    }

    public void crearUsuario(String tipo, String DNI, String Nombre, String Email, String Direccion, int NumUsuarios, String Contraseña, int id, String Rol) {
        usuario = null;
        if (tipo.equalsIgnoreCase("Cliente")) {
            usuario = new Cliente(DNI, Nombre, Email, Direccion, NumUsuarios, Contraseña, id);

        } else if (tipo.equalsIgnoreCase("Personal")) {
            usuario = new Personal(DNI, Nombre, Email, Direccion, NumUsuarios, Contraseña, id, Rol);

        } else {
            throw new IllegalArgumentException("El tipo de usuario debe ser 'Cliente' o 'Personal'.");
        }
    }

    public Factura crearFactura(int numMesa) {
        Mesa mesa = mesas.get(numMesa);
        if (mesa == null) {
            throw new IllegalArgumentException("El número de mesa es inválido.");
        }

        Cuenta cuenta = mesa.getCuenta();
        double importeTotal = 0.0;

        ArrayList<Producto> productos = new ArrayList<>();
        for (Producto prod : cuenta.getProductos()) {
            productos.add(prod);
            importeTotal += prod.getPrecio();
        }

        int id = 1; // Ejemplo, podría generarse de forma más sofisticada.
        return new Factura(id, new Date(), importeTotal, productos);
    }

    public Map<Integer, Mesa> getMesas() {
        return mesas;
    }
}
