import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void setConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        int count = 1;
        System.out.println("===================================");
        for(Conta conta : contas){
            System.out.printf("Conta:\t %d\n",count++);
            System.out.printf("Agência:\t %d\n",conta.getAgencia());
            System.out.printf("ID da conta:\t %d\n",conta.getID());
            System.out.printf("Titular:\t %S\n",conta.getTitutar());
            System.out.println("===================================");
        }
    }
}
