package State;

public class Prendido implements IEstado{

    private int programas;

    @Override
    public void handler(Computadora computadora) {

        System.out.println("***********************Prendido");
        computadora.setConsumoCpu(computadora.getProgramaAbierto().length*5);
        computadora.setConsumoRam(computadora.getProgramaAbierto().length*5);
        System.out.println("Ram"+computadora.getConsumoRam()+"%");
        System.out.println("Cpu"+computadora.getConsumoCpu()+"%");
        System.out.println("**********************Programas Abiertps");
        for(int i=0;i<computadora.getProgramaAbierto().length;i++)
    }
}
