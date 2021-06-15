package State;

public class Apagado implements IEstado{
    public void handler(Computadora computadora){
        System.out.println("**********************Apagado");
        computadora.setConsumoRam(0);
        computadora.setConsumoCpu(0);
        computadora.setProgramaAbierto(new String[20]);
        System.out.println("Ram"+computadora.getConsumoRam()+"%");
        System.out.println("Cpu"+computadora.getConsumoCpu()+"%");
        System.out.println("*************************No hay programas abiertos");
    }
}
