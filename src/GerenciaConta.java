import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.isNull;

public class GerenciaConta {

    private List<Conta> contas;

    public GerenciaConta() {
        contas = new ArrayList<>();
    }

    //Adicionar conta Corrente
    public void abrirContaCorrente(String nome, String cpf, double saldo, int numero) {
        contas.add(new ContaCorrente(saldo, cpf, nome, numero));
    }

    //Adicionar conta Especial
    public void abrirContaEspecial(String nome, String cpf, double saldo, double limite, int numero) {
        contas.add(new ContaEspecial(saldo, cpf, nome, limite, numero));
    }

    //Adicionar conta Poupança
    public void abrirContaPoupanca(double saldo, String cpf, String nome, int numero) {
        contas.add(new ContaPoupanca(saldo, cpf, nome, numero));
    }

    //Remover ou fechar conta
    public boolean remover(Conta conta) {
        for(Conta c : contas) {
            if(c.getConta() == conta.getConta()) {
                contas.remove(c);
                return true; //retornará true caso encontre a conta a ser excluída
            }
        }
        return false; //retornará false caso não encontre a conta a ser excluída
    }

    //Buscar por numero da conta
    public Conta buscarNumeroConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    //Saque
    public boolean saque(int numero, double valor) {
        Conta conta = this.buscarNumeroConta(numero);
        if (!isNull(conta)) {
            return conta.sacar(valor);
        }
        return false;
    }

    public boolean depositar(int numero, double valor) {
        Conta conta = this.buscarNumeroConta(numero);
        if (!isNull(conta)) {
            return conta.depositar(valor);
        }
        return false;
    }

    //Listar todas as contas
    public String listarContas() {
        String listar = "";
        for(Conta c : contas) {
            listar += c.toString();
        }
        return listar;
    }

    @Override
    public String toString() {
        return "GerenciaConta " +
                contas;

    }

    //Saldo da conta
    public void saldo(int conta) {
        Conta verificarSaldo = this.buscarNumeroConta(conta);
        if (!isNull(verificarSaldo)) {
            System.out.println("O saldo da sua conta é R$" + verificarSaldo.getSaldo() + ", obrigado pela preferência, " + verificarSaldo.getNome());
        } else {
            System.out.println("Número de conta inexistente");
        }
    }


}


