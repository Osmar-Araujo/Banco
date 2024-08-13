import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupança;

public class Main {
    public static void main(String[] args) {
        Cliente clienteX = new Cliente();
        clienteX.setNome("Exemplo");

        Conta cc = new ContaCorrente(clienteX);
        cc.depositar(300);
        Conta cp = new ContaPoupança(clienteX);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}