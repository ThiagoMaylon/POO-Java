public abstract class Conta implements ContaBancaria{
    private int agencia;
    private int numero;
    private double saldo;
    
    private static int AGENCIA_PADRAO = 1243;
    private static int SEQUENCIAL = 1;

    public void sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
        }else{
            System.out.println("Valor inválido");
        }

    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferencia(double valor, Conta destino){
        sacar(valor);
        destino.depositar(valor);
    }
    public abstract void imprimirExtrato();

    public Conta(){
        this.saldo = 0d;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
