package ChainResponsability;

public class Mensaje {
    private boolean estudiantes;
    private boolean docentes;
    private boolean administrativos;
    private String contenido;

    public Mensaje(boolean estudiantes, boolean docentes, boolean administrativos, String contenido) {
        this.estudiantes = estudiantes;
        this.docentes = docentes;
        this.administrativos = administrativos;
        this.contenido = contenido;
    }

    public boolean isEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(boolean estudiantes) {
        this.estudiantes = estudiantes;
    }

    public boolean isDocentes() {
        return docentes;
    }

    public void setDocentes(boolean docentes) {
        this.docentes = docentes;
    }

    public boolean isAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(boolean administrativos) {
        this.administrativos = administrativos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
