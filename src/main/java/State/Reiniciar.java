package State;

public class Reiniciar implements IEstado{

    @Override
    public void handler(Computadora computadora) {
        System.out.println("******************Reiniciando");
        System.out.println("Ram Antes "+computadora.getConsumoRam()+"%");
        System.out.println("Cpu Antes "+computadora.getConsumoCpu()+"%");
        computadora.setConsumoRam(0);
        computadora.setConsumoCpu(0);
        computadora.setProgramaAbierto(new String[20]);

        System.out.println("Ram Ahora "+computadora.getConsumoRam()+"%");
        System.out.println("Cpu Antes "+computadora.getConsumoCpu()+"%");
        System.out.println("**************************Se cerraron los programas");
    }
}
