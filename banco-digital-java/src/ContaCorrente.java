public class ContaCorrente extends Conta{
    @Override
    public void imprimirExtrato(){
        System.out.println("*** Conta Corrente ***");
        System.out.printf("Saldo: %,.2f\n", this.getSaldo());
        System.out.printf("Agência: %d\n", this.getAgencia());
        System.out.printf("Numero da Conta: %d\n", this.getNumero());
    }


}
