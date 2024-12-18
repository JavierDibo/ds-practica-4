package ds.practica.cuatro;

class Personal extends Usuario {
    private int IdPersonal;
    private String Rol;

    public Personal(String DNI, String Nombre, String Email, String Direccion, int NumUsuarios, String Contraseña, int IdPersonal, String Rol) {
        super(DNI, Nombre, Email, Direccion, NumUsuarios, Contraseña);
        this.IdPersonal = IdPersonal;
        this.Rol = Rol;
    }
}