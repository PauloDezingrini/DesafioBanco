public class ContaPoupanca extends Conta {

    private static double RENDIMENTO = 0.01;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(Cliente cliente,double saldoInicial) {
        super(cliente,saldoInicial);
    }
    public ContaPoupanca(Cliente cliente,int agencia) {
        super(cliente,agencia);
    }

    public static void atualizarRendimento(double rendimento) {
        ContaPoupanca.RENDIMENTO = rendimento;
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato da Conta poupança ===");
        super.extrato();
    }

    @Override
    public void rendimento(){
        this.saldo += this.saldo*RENDIMENTO;
    }
}
