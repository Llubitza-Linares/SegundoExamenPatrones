package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Estrategia2 implements IOrdenamiento {

    @Override
    public void ordenar(List<Usuario> usuarios) {
        System.out.println("*************************Ordenando por nombre: ");
        List<Usuario> ordenado = new LinkedList<Usuario>();
        for (Usuario usuario : ordenado) {
            ordenado.add(usuario);
        }
        char menor = 'z';
        while (ordenado.size() != usuarios.size()) {
            menor = 'z';
            Usuario uMenor = null;
            for (Usuario usuario : usuarios) {
                if (usuario.getNombre().charAt(0) < menor && !ordenado.contains(usuario)) {
                    menor = usuario.getNombre().charAt(0);
                    uMenor = usuario;
                }
            }
            ordenado.add(uMenor);
        }
        for (Usuario usuario : ordenado) {
            usuario.showInfo();
        }
    }
}