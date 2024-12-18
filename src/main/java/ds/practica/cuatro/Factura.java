package ds.practica.cuatro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

class Factura {
    private int id;
    private Date fecha;
    private double importeTotal;
    private ArrayList<Producto> productos = new ArrayList<>();

    public Factura(int id, Date fecha, double importeTotal, ArrayList<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.importeTotal = importeTotal;
        this.productos = productos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}