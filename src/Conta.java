public class Conta {

    private static int numeroDaConta = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.agencia = 11;
        this.numero = numeroDaConta++;
        banco.adicionarConta(this);
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfos(){
        System.out.println("Titular da conta: " + this.cliente.getNome());
        System.out.println("Numero da agencia: "+ this.agencia);
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Saldo da conta: " + this.saldo);
    }


}
