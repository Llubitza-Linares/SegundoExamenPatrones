package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Estrategia1 implements IOrdenamiento {

    @Override
    public void ordenar(List<Usuarios> usuarios) {
        System.out.println("********************Ordenando por ci: ");
        List<Usuarios> ordenado = new LinkedList<Usuarios>();
        int menor = Integer.MAX_VALUE;
        while (ordenado.size() != usuarios.size()) {
            menor = Integer.MAX_VALUE;
            Usuarios uMenor = null;
            for (Usuarios usuario : usuarios) {
                if (usuario.getCi() < menor && !ordenado.contains(usuario)) {
                    menor = usuario.getCi();
                    uMenor = usuario;
                }
            }
            ordenado.add(uMenor);
        }
        for (Usuarios usuario : ordenado) {
            usuario.showInfo();
        }
    }
}