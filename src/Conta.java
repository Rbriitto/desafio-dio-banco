public class Conta implements IConta {
 protected  int agencia;
 protected  int numero;
 protected  double saldo;
 private static final int AGENCIA_PADRAO = 1;
 private static int SEQUENCIAL = 1;
 protected Cliente cliente;
  

 
 
 public Conta(Cliente cliente) {
  this.agencia = Conta.AGENCIA_PADRAO;
  this.numero = SEQUENCIAL++;
  this.cliente = cliente;
 }
  
 
 public int getAgencia() {
  return agencia;
 }
 
 
 public int getNumero() {
  return numero;
 }   

 
 public double getSaldo() {
    return saldo;
}
protected void imprimirInformacoesComuns() {
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Agencia: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
   }


    @Override
    public void sacar(double valor) {
        if(saldo>=valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente, operação não realizada");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo>=valor){
        this.sacar(valor);
        contaDestino.depositar(valor);

    }else{

        System.out.println("Saldo insuficiente, operação não realizada");
    }
    }


    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        
    }

   

}
