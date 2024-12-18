package ds.practica.cuatro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestauranteTest {
    /**
     * Black box: pruebo con los valores de entrada posibles
     * Siendo la entrda un valor entero por defecto que indica el identificador de la mesa
     * tenemos que probar con valores negativos, cero y positivos
     * así como probar que si la mesa no existe me devuelva la excepción correspondiente
     * White box: pruebo con los caminos posibles
     * Como solo hay un if, pruebo con la ejecucion normal y con el caso concreto
     */
    @Test
    void testCrearFactura() {
        int numMesas = 1;
        int idMesa = 0;
        Restaurante restaurante = new Restaurante(numMesas, 5);
        Mesa mesa = restaurante.getMesas().get(idMesa);
        mesa.getCuenta().getProductos().add(new Producto(10.0));
        mesa.getCuenta().getProductos().add(new Producto(15.0));

        assertAll("factura",
                /// Black box testing
                () -> assertThrows(IllegalArgumentException.class, () -> restaurante.crearFactura(-1)),
                () -> assertThrows(IllegalArgumentException.class, () -> restaurante.crearFactura(100)),
                () -> assertDoesNotThrow(() -> restaurante.crearFactura(idMesa)),
                () -> assertNotNull(restaurante.crearFactura(idMesa)),
                () -> assertEquals(25.0, restaurante.crearFactura(idMesa).getImporteTotal()),
                () -> assertEquals(2, restaurante.crearFactura(idMesa).getProductos().size())
                /// White box testing
                    // Camino 1 -- el if no entra en la excepcion y se ejecuta el for
                /* Comentado porque se está probrando exactamente igual arriba
                ,() -> assertDoesNotThrow(() -> restaurante.crearFactura(idMesa)),
                () -> assertNotNull(restaurante.crearFactura(idMesa)),
                () -> assertEquals(25.0, restaurante.crearFactura(idMesa).getImporteTotal()),
                */
                    // Camino 2 -- el if entra en la excepcion y no se ejecuta el for
                /* Comentado porque se está probando exactamente igual arriba
                () -> assertThrows(IllegalArgumentException.class, () -> restaurante.crearFactura(-1))
                */
        );
    }


}
