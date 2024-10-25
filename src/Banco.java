import java.util.List;

public class Banco {

    private String nomeBanco;
    private List<Conta> contas;

    

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
             return nomeBanco;

    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
