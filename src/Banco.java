import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Banco {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void imprimirContas() {
        System.out.println("Contas no banco " + this.nome + ":");
        for (Conta conta : contas) {
            conta.imprimirInfos();
            System.out.println();
        }
    }

    public void ajuda(){
        System.out.println("Relate seu problema ao nosso canal de suporte!");
        String texto = scan.nextLine();
        System.out.println("Deseja enviar a mensagem: " + "'" + texto + "'" +"ao nosso canal de suporte? Se deseja enviar digite 'Sim'");
        String option = scan.nextLine();
        if (option.equalsIgnoreCase("sim")){
            System.out.println("Mensagem enviada com sucesso!");
        }else {
            System.out.println("Mensagem cancelada!");
        }

    }
}
