public class Main {
    public static void main(String[] args) {
        Cliente paulo = new Cliente("Paulo Dezingrini",1234567891);
        Conta contaCorrente = new ContaCorrente(paulo);
        Conta contaPoupanca = new ContaPoupanca(paulo);

        contaCorrente.depositar(100);
        contaPoupanca.depositar(50);

        contaCorrente.extrato();
        contaPoupanca.extrato();

        contaCorrente.sacar(25);
        contaPoupanca.sacar(36);

        contaCorrente.extrato();
        contaPoupanca.extrato();

        contaCorrente.transferir(50,contaPoupanca);

        contaCorrente.extrato();
        contaPoupanca.extrato();
    }
}
