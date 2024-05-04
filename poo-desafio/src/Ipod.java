import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
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
}
