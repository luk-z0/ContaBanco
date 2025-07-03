public class ContaTerminal{
    private String nome;
    private String agencia;
    private int conta;
    private double saldo;

    public ContaTerminal() {}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "nome='" + nome + '\'' +
                ", agencia='" + agencia + '\'' +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
