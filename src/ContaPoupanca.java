public class ContaPoupanca extends Conta{

    private double taxa;

    //Construtor
    public ContaPoupanca(double saldo, String cpf, String nome, int numero) {
        super(saldo, cpf, nome, numero);
    }

    //Getter e Setters
    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "CONTA POUPANÇA  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: "
                + getNumero() + " SALDO: " + getSaldo();
    }

    @Override
    public boolean depositar(double valor) {
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

}
