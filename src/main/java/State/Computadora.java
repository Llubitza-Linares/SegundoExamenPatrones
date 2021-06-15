package State;

public class Computadora {
    private IEstado estado;
    private String[] programaAbierto=new String[20];
    private int consumoRam;
    private int consumoCpu;


    public IEstado getEstado() {
        return estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public String[] getProgramaAbierto() {
        return programaAbierto;
    }

    public void setProgramaAbierto(String[] programaAbierto) {
        this.programaAbierto = programaAbierto;
    }

    public int getConsumoRam() {
        return consumoRam;
    }

    public void setConsumoRam(int consumoRam) {
        this.consumoRam = consumoRam;
    }

    public int getConsumoCpu() {
        return consumoCpu;
    }

    public void setConsumoCpu(int consumoCpu) {
        this.consumoCpu = consumoCpu;
    }

    public void request(){
        this.estado.handler(this);
    }
}
