import org.jetbrains.annotations.NotNull;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = NUMERO++;
        this.titular = cliente;
        this.saldo = 0;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor,Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void extrato() {

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
