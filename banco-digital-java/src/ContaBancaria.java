public interface ContaBancaria {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferencia(double valor, Conta destino);
}
