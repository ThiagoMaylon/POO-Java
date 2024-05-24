public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato(){
        System.out.println("*** Conta Poupança ***");
        System.out.printf("Saldo: %,.2f\n", this.getSaldo());
        System.out.printf("Agência: %d\n", this.getAgencia());
        System.out.printf("Numero da Conta: %d\n", this.getNumero());
    }

}
