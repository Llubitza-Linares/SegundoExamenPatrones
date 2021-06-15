package Strategy;

public class Usuario {
    private int ci;
    private String nombre;
    private int fechaDeNacimiento;
    private String profesion;

    public Usuario(int ci, String nombre, int fechaNacimiento, String profesion) {
        super();
        this.ci = ci;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaNacimiento;
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaDeNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void showInfo() {
        System.out.println("Carnet Identidad: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("Profesion: " + profesion);

    }
}