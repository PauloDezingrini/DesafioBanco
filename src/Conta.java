public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int ID_CONTA = 1;

    protected int agencia;
    protected int idConta;
    protected double saldo;
    protected Cliente titular;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.idConta = ID_CONTA++;
        this.titular = cliente;
        this.saldo = 0;
    }

    public Conta(Cliente cliente,double saldoInicial) {
        this.agencia = AGENCIA_PADRAO;
        this.idConta = ID_CONTA++;
        this.titular = cliente;
        this.saldo = saldoInicial;
    }

    public Conta(Cliente cliente,int agencia) {
        this.agencia = agencia;
        this.idConta = ID_CONTA++;
        this.titular = cliente;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getID() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitutar(){
        return this.titular.getNome();
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
        System.out.printf("Titular:\t%s\n",this.titular.getNome());
        System.out.printf("Agência:\t%d\n",this.agencia);
        System.out.printf("Número da conta:\t%d\n",this.idConta);
        System.out.printf("Saldo:\t%.2f\n",this.saldo);
    }

}
