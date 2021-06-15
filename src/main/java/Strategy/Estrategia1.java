package Strategy;

public class Estrategia1 implements IOrdenamiento {

    @Override
    public void ordenar(List<Usuario> usuarios) {
        System.out.println("********************Ordenando por ci: ");
        List<Usuario> ordenado = new LinkedList<Usuario>();
        int menor = Integer.MAX_VALUE;
        while (ordenado.size() != usuarios.size()) {
            menor = Integer.MAX_VALUE;
            Usuario uMenor = null;
            for (Usuario usuario : usuarios) {
                if (usuario.getCi() < menor && !ordenado.contains(usuario)) {
                    menor = usuario.getCi();
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