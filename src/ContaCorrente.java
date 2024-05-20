public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirInfos() {
        System.out.println("=== CONTA CORRENTE ===");
        super.imprimirInfos();
        System.out.println("======================");
    }
}
