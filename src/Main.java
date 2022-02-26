import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        Cliente paulo = new Cliente("Paulo Dezingrini",1234567891);
        Conta contaCorrente = new ContaCorrente(paulo,2);
        Conta contaPoupanca = new ContaPoupanca(paulo,75d);
        Banco bradesco = new Banco("Bradesco");

        contaCorrente.depositar(100);
        contaPoupanca.depositar(50);
        contaPoupanca.rendimento();

        contaCorrente.extrato();
        contaPoupanca.extrato();

        contaCorrente.sacar(25);
        contaPoupanca.sacar(36);

        contaCorrente.extrato();
        contaPoupanca.extrato();

        contaCorrente.transferir(50,contaPoupanca);

        contaCorrente.extrato();
        contaPoupanca.extrato();
        
        bradesco.setConta(contaCorrente);
        bradesco.setConta(contaPoupanca);
        bradesco.listarContas();
    }
}
