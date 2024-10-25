public class Main {
public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.setNome("Rodrigo");
    cliente.setCpf("1511411001");

    Conta cc =  new ContaCorrente(cliente);
    Conta poupanca = new ContaPoupanca(cliente);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

    cc.depositar(252);
    poupanca.sacar(40);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

    poupanca.transferir(35, cc);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();

   
    System.out.println("$$ Bem vindo ao Banco $$\n");
    cc.depositar(100);
    cc.transferir(100, poupanca);


    cc.imprimirExtrato();
    poupanca.imprimirExtrato();



}
}
