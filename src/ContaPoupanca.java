public class ContaPoupanca extends Conta{

    private double taxa = 5;

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
    public boolean depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Valor depositado com sucesso, seu saldo é de R$" + this.getSaldo());
            return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo((this.getSaldo() - valor) - this.taxa);
            System.out.println("Por ser uma conta poupança temos um valor fixo de tarifa para cada saque de R$5,00");
            System.out.println("Saque realizado com sucesso, seu saldo é de R$: " + this.getSaldo());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nCONTA POUPANÇA" + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nNÚMERO DA CONTA: "
                + getNumero() + "\nSALDO: " + getSaldo();
    }

    @Override
    public void saldo(int conta) {

    }

}
