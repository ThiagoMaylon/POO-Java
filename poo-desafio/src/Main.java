import interfaces.Navegador;

public class Main {
    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        Navegador safari = new Safari();
        Telefone telefone = new Telefone();
        Iphone iphone = new Iphone();

        ipod.tocar();
        safari.exibirPagina();
        telefone.ligar();

        iphone.ligar();
        iphone.tocar();
        iphone.exibirPagina();
        iphone.pausar();

    }
}