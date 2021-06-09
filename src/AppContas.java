import java.util.Scanner;

public class AppContas {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        GerenciaConta contas = new GerenciaConta();

        int opcao = 0, numero = 0, saque;
        String nome, cpf;
        double saldo, limite;

        while(opcao <= 6) {
            System.out.println("Sistema bancário AnheBank");
            System.out.println("Clique na opção que deseja realizar");
            System.out.println("1 - Abrir conta corrente");
            System.out.println("2 - Abrir conta especial");
            System.out.println("3 - Abrir conta poupança");
            System.out.println("4 - Buscar por número da conta");
            System.out.println("5 - Realizar saque");
            System.out.println("7 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    nome = sc.next();
                    System.out.println("Digite seu CPF: ");
                    cpf = sc.next();
                    System.out.println("O numero de sua conta é: ");
                    numero++;
                    System.out.println(numero);
                    System.out.println("Informe o valor que deseja depositar: ");
                    saldo = sc.nextDouble();

                    contas.abrirContaCorrente(nome, cpf, saldo, numero);
                    System.out.println(contas);
                    System.out.println();

                    break;

                case 2:
                    System.out.println("Digite seu nome: ");
                    nome = sc.next();
                    System.out.println("Digite seu CPF: ");
                    cpf = sc.next();
                    System.out.println("O numero de sua conta é: ");
                    numero++;
                    System.out.println(numero);
                    System.out.println("Informe o valor que deseja depositar: ");
                    saldo = sc.nextDouble();
                    System.out.println("Qual o limite que deseja atribuir para sua conta: ");
                    limite = sc.nextDouble();


                    contas.abrirContaEspecial(nome, cpf, saldo, limite, numero);
                    System.out.println(contas);
                    System.out.println();

                    break;

                case 3:
                    System.out.println("Digite seu nome: ");
                    nome = sc.next();
                    System.out.println("Digite seu CPF: ");
                    cpf = sc.next();
                    System.out.println("O numero de sua conta é: ");
                    numero++;
                    System.out.println(numero);
                    System.out.println("Informe o valor que deseja depositar: ");
                    saldo = sc.nextDouble();

                    contas.abrirContaPoupanca(saldo, cpf, nome, numero);
                    System.out.println(contas);

                    break;

                case 4:
                    System.out.println("Qual numero da conta: ");
                    numero = sc.nextInt();
                    System.out.println(contas.buscarNumeroConta(numero));

                break;

                case 5:
                    System.out.println("Qual número da conta que deseja sacar ?");
                    numero = sc.nextInt();
                    System.out.println("Qual o valor que deseja sacar ?");
                    saque = sc.nextInt();

                    if (contas.saque(numero, saque)) {
                        System.out.println("O valor do seu saque foi de R$" + saque + " e foi realizado com sucesso");
                        System.out.println("Saque realizado na conta: " + numero);
                    }else {
                        System.out.println("Erro, saldo insuficiente");
                    }

                    break;
            }
        }

    }
}
