public abstract class Conta {

    private String cliente;
    private int numero;
    private double saldo;
    private double saque;
    private double depositar;
    private Conta conta;
    private boolean status;

    //cliente
    private String cpf;
    private String nome;

    //Construtor
    public Conta(double saldo, String cpf, String nome, int numero) {
        this.numero = numero;
        this.saldo = saldo;
        this.cpf = cpf;
        this.nome = nome;
        this.status = true;
    }

    public Conta() {

    }

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente='" + cliente + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", saque=" + saque +
                ", depositar=" + depositar +
                ", conta=" + conta +
                ", status=" + status +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public abstract boolean depositar(double valor);

    public abstract boolean sacar(double valor);

    public abstract void saldo(int conta);

}
