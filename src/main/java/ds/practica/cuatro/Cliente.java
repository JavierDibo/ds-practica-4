package ds.practica.cuatro;

class Cliente extends Usuario {
    private int IdCliente;

    public Cliente(String DNI, String Nombre, String Email, String Direccion, int NumUsuarios, String Contraseña, int IdCliente) {
        super(DNI, Nombre, Email, Direccion, NumUsuarios, Contraseña);
        this.IdCliente = IdCliente;
    }
}