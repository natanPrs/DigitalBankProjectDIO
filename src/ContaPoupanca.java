public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirInfos() {
        System.out.println("=== CONTA POUPANCA ===");
        super.imprimirInfos();
        System.out.println("======================");

    }
}
