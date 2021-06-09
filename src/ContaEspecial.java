public class ContaEspecial extends Conta{

    private double limite;

    //Construtor
    public ContaEspecial(double saldo, String cpf, String nome, double limite, int numero) {
        super(saldo, cpf, nome, numero);
        this.limite = limite;
    }

    //Getter e Setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Métodos
    @Override
    public boolean depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Valor depositado com sucesso, seu saldo é de R$" + this.getSaldo());
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= (this.getSaldo() + this.getLimite())) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso, seu saldo é de: R$" + this.getSaldo());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nCONTA ESPECIAL  " + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nNÚMERO DA CONTA: "
                + getNumero() + "\nSALDO: " + getSaldo() + "\nLIMITE: " + limite;
    }

    @Override
    public void saldo(int conta) {

    }

}
