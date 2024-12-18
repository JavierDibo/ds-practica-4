package ds.practica.cuatro;

class Mesa {
    private int numero;
    private int capacidad;
    private Cuenta cuenta;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.cuenta = new Cuenta();
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }
}