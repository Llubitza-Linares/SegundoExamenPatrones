package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Estrategia2 implements IOrdenamiento {

    @Override
    public void ordenar(List<Usuarios> usuarios) {
        System.out.println("*************************Ordenando por nombre: ");
        List<Usuarios> ordenado = new LinkedList<Usuarios>();
        for (Usuarios usuario : ordenado) {
            ordenado.add(usuario);
        }
        char menor = 'z';
        while (ordenado.size() != usuarios.size()) {
            menor = 'z';
            Usuarios uMenor = null;
            for (Usuarios usuario : usuarios) {
                if (usuario.getNombre().charAt(0) < menor && !ordenado.contains(usuario)) {
                    menor = usuario.getNombre().charAt(0);
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