package Observer;

public class Persona {
    private String name;

    public Persona(String name){
        this.name=name;
    }

    public void info(){
        System.out.println("Nombre: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
