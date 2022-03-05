package dio.projeto.banco;

public class Main {
    public static void main(String[] args) {
        Cliente Joao = new Cliente();
        Joao.setNome("Joao");

        Conta cc = new ContaCorrente(Joao);

        Conta poupanca = new ContaPoupanca(Joao);
        cc.depositar(150);
        cc.transferir(85, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
