package Strategy;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        Estrategia1 estrategia1 = new Estrategia1();
        Estrategia2 estrategia2 = new Estrategia2();
        Estrategia3 estrategia3 = new Estrategia3();

        Usuarios usuario1 = new Usuarios(654516321, "Adrian", 2000, "Administrador");
        Usuarios usuario2 = new Usuarios(656554651, "Juan", 2004, "Contador");
        Usuarios usuario3 = new Usuarios(846518436, "Camila", 1999, "Programador");
        Usuarios usuario4 = new Usuarios(654654465, "Alejandra", 2003, "Policia");
        Usuarios usuario5 = new Usuarios(564641214, "Natalia", 2005, "Medico");

        List<Usuarios> usuarios = new LinkedList<Usuarios>();

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
