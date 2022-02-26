public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO = 1;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = NUMERO++;
        this.saldo = 0;
    }

    @Override
    public void sacar(double valor){

    }

    @Override
    public void depositar(double valor) {
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

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
}
