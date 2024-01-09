import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        //Instânciamos um objeto chamado leia da classe Scanner.
        Scanner leia = new Scanner(System.in);

        //Diálogo com o usuário e leitura de valores. 
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = leia.next();
        System.out.print("Qual o vaor do depósito inicial? ");
        double saldoCliente = leia.nextDouble();
        leia.close();
        System.out.println("Sua conta será criada na agência padrão: 0001");
        System.out.println("Sua conta é a de número: 45678");

        //Instanciamos um objeto chamado contaCliente através do método criarConta, passando os valores na criação.
        ContaTerminal contaCliente = criarConta(4567 - 8, "0001-0", nomeCliente, saldoCliente);
                

        //Saudação final conforme solicitado na formação Java. 
        System.out.println("Olá " + contaCliente.obterNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, o número da sua agência é " + contaCliente.obterAgencia()
                + ", com número da conta " + contaCliente.obterConta() + " e seu saldo R$" + contaCliente.obterSaldo()
                + " está disponível para saque.");

    }
    // Método estático que retorna um objeto ContaTerminal já criado.
    public static ContaTerminal criarConta(int conta, String agencia, String nomeCliente, double saldo) {
        return new ContaTerminal(conta, agencia, nomeCliente, saldo);
    }

}
