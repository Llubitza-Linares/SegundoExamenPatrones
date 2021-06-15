package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        Estrategia1 estrategia1 = new Estrategia1();
        Estrategia2 estrategia2 = new Estrategia2();
        Estrategia3 estrategia3 = new Estrategia3();

        Usuario usuario1 = new Usuario(654516321, "Adrian", 2000, "Administrador");
        Usuario usuario2 = new Usuario(656554651, "Juan", 2004, "Contador");
        Usuario usuario3 = new Usuario(846518436, "Camila", 1999, "Programador");
        Usuario usuario4 = new Usuario(654654465, "Alejandra", 2003, "Policia");
        Usuario usuario5 = new Usuario(564641214, "Natalia", 2005, "Medico");

        List<Usuario> usuarios = new LinkedList<Usuario>();

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);

        baseDeDatos.setUsuarios(usuarios);

        baseDeDatos.setOrdenamiento(estrategia1);
        baseDeDatos.ordenar();

        baseDeDatos.setOrdenamiento(estrategia2);
        baseDeDatos.ordenar();

        baseDeDatos.setOrdenamiento(estrategia3);
        baseDeDatos.ordenar();
    }
}
