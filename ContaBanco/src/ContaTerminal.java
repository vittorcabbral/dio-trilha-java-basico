
public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(){

    }

    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String imprimirConta(){
        String mensagem = "\nOlá, ".concat(this.getNomeCliente().toUpperCase()) + "!\n" +
                          "Obrigado por criar uma conta em nosso banco! :)\n" +
                          "Sua agência é ".concat(this.getAgencia()) + ", conta " + this.getNumeroConta() + 
                          " e seu saldo de R$" + this.getSaldo() + " está disponível para saque.";

        return mensagem;
    }

}
