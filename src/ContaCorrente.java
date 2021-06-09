public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, String cpf, String nome, int numero) {
        super(saldo, cpf, nome, numero);
    }

    //Métodos
    @Override
    public boolean depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CONTA CORRENTE  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: " + getNumero()
                + " SALDO: " + getSaldo();
    }

}


