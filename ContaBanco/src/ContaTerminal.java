public class ContaTerminal {
    //Nessa fase da formação ainda não foi explicado a idéia de construtores, mas eu lembro como funciona. 
    //Resolvi colocar um construtor para obrigar a passagem dos valores na criação do objeto. 
    public ContaTerminal(int conta, String agencia, String nomeCliente, double saldo){
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    //Criamos os atributos da classe ContaTerminal.
    //Os atributos foram criados com o modificador de acesso private, onde só possuem visibilidade na 
    //própria classe.
    
    private int conta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    //Método depositar para inserir um saldo inicial, se o valor informado for inválido vai mostrar a mensagem. 
    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido! O depósito não foi realizado");
        }else{
            this.saldo = saldo += valor;
            System.out.println("Depósito realizado com sucesso! Seu novo saldo é de R$"+this.saldo);
        }
    }

    //Acessamos os atributos através de métodos 'obter' get.
    public int obterConta(){
        return this.conta;
    }
    public String obterAgencia(){
        return this.agencia;
    }

    public String obterNomeCliente(){
        return this.nomeCliente;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    
}
