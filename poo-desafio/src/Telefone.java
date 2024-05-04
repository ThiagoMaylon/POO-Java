import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

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
