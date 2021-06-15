package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Estrategia3 implements IOrdenamiento {

    @Override
    public void ordenar(List<Usuarios> usuarios) {
        System.out.println("******************************Ordenando por profesión o fecha de nacimientos: ");
        List<Usuarios> ordenadoProfesion = new LinkedList<Usuarios>();
        for (Usuarios usuario : ordenadoProfesion) {
            ordenadoProfesion.add(usuario);
        }
        char menor = 'z';
        while (ordenadoProfesion.size() != usuarios.size()) {
            menor = 'z';
            Usuarios uMenor = null;
            for (Usuarios usuario : usuarios) {

                if (usuario.getProfesion().charAt(0) < menor && !ordenadoProfesion.contains(usuario)) {
                    menor = usuario.getProfesion().charAt(0);
                    uMenor = usuario;
                }
            }
            ordenadoProfesion.add(uMenor);
        }
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            for (int i = 1; i < ordenadoProfesion.size(); i++) {
                if (ordenadoProfesion.get(i).getProfesion().equals(ordenadoProfesion.get(i - 1).getProfesion())
                        && ordenadoProfesion.get(i).getFechaNacimiento() < ordenadoProfesion.get(i - 1)
                        .getFechaNacimiento()) {
                    ordenado=false;
                    Usuarios usuarios1 = ordenadoProfesion.remove(i);
                    ordenadoProfesion.add(i + 1, usuarios1);
                }
            }
        }
        for (Usuarios usuario : ordenadoProfesion) {
            usuario.showInfo();
        }
    }
}