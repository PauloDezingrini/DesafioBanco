public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    public ContaCorrente(Cliente cliente,double saldoInicial) {
        super(cliente,saldoInicial);
    }
    public ContaCorrente(Cliente cliente,int agencia) {
        super(cliente,agencia);
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato da Conta corrente ===");
        super.extrato();
    }

    @Override
    public void rendimento(){
        System.out.println("Sua conta não possui serviços de rendimento");
    }


}
