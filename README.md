Creadas las funciones: `crearFactura()` y `crearUsuario()`.
Creado el test para la funcion `crearFactura()`: `crearFacturaTest()`.

```java
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
```

