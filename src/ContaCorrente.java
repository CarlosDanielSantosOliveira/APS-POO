public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, String cpf, String nome, int numero) {
        super(saldo, cpf, nome, numero);
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
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso, seu saldo é de: R$" + this.getSaldo());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nCONTA CORRENTE  " + "\nNOME: " + getNome() + "\nCPF: " + getCpf() + "\nNÚMERO DA CONTA: " + getNumero()
                + " \nSALDO: " + getSaldo() + "\n";
    }

    @Override
    public void saldo(int conta) {

    }
}


