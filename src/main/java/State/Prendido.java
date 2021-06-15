package State;

import java.util.Random;

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
        for(int i=0;i<computadora.getProgramaAbierto().length;i++){
            System.out.println(""+computadora.getProgramaAbierto()[i]);
        }
    }
    private String[]abrir(){
        Random random=new Random();
        programas=random.nextInt(20)+1;
        String[]programa=new String[programas];
        for(int i=0;i<programas;i++){
            programa[i]="Programa"+(i+1);
        }
        return programa;
    }
}
