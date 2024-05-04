import interfaces.Navegador;

public class Safari implements Navegador {
    @Override
    public void exibirPagina() {
        System.out.println("exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba do navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
