package ds.practica.cuatro;

class Usuario {
    private String DNI;
    private String Nombre;
    private String Email;
    private String Direccion;
    private int NumUsuarios;
    private String Contraseña;

    public Usuario(String DNI, String Nombre, String Email, String Direccion, int NumUsuarios, String Contraseña) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Direccion = Direccion;
        this.NumUsuarios = NumUsuarios;
        this.Contraseña = Contraseña;
    }
}