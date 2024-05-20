public class Main {
    public static void main(String[] args) {

        Banco inter = new Banco("Inter");

        Cliente natan = new Cliente("Natan", 6);
        Cliente pedro = new Cliente("Pedro", 25);
        Cliente rosa = new Cliente("Rosa", 10);

        Conta contaN = new ContaCorrente(natan, inter);
        Conta contaP = new ContaPoupanca(pedro, inter);
        Conta contaR = new ContaCorrente(rosa, inter);

        /*contaN.depositar(100);
        contaN.sacar(20);
        contaN.imprimirInfos();

        contaP.imprimirInfos();
        contaN.transferir(contaP, 30);

        contaN.imprimirInfos();
        contaP.imprimirInfos();

        contaR.imprimirInfos();*/

        // Imprime todas as contas do banco
        inter.imprimirContas();
        inter.ajuda();
    }
}
