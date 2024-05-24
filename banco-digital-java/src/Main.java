public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(500.67);
        cp.depositar(45.50);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.sacar(25.90);
        cc.transferencia(200, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}