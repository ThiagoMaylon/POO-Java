import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico {
    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica");
    }
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
    @Override
    public void ligar() {
        System.out.println("ligando para ....");
    }

    @Override
    public void tender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }
}
