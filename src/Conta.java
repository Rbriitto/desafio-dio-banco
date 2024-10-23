public class Conta implements IConta {
 protected  int agencia;
 protected  int numero;
 protected  double saldo;
 private static final int AGENCIA_PADRAO = 1;
 private static int SEQUENCIAL = 1;
  

 
 
 public Conta() {
  this.agencia = Conta.AGENCIA_PADRAO;
  this.numero = SEQUENCIAL++;
 }
  
 
 public int getAgencia() {
  return agencia;
 }
 
 
 public int getNumero() {
  return numero;
 }   

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Agencia: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
       }


    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        
    }
   

}
