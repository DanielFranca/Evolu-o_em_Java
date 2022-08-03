package POO_E_ENCAPSULAMENTO;
/*GETTER
- É UM MÉTODO PÚBLICO QUE SERVE PARA CONSULTAR DADOS;
- A nomenclatura desses métodos é Get_nome_do_atributo()


*/

public class Conta{
    int numero;
    private float saldo;
    private float limite;
    Cliente cliente;
    public String getSaldo;
    public String getsaldo; 

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = this.saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    //this.saldo = this.saldo - valor
    public void sacar(float valor){
        if(valor <= this.saldo) {
          this.saldo = this.saldo - valor;  
        }else if (valor <= (this.saldo + this.limite)){
            System.out.println("Entrou no Limite");
            //Calculando o valor excedente do saque 
            //(Saldo = 100) (Saque - 200)  = -100
            float val_ret = this.saldo -  valor;
            if(val_ret < 0){
                this.saldo = 0;
            }
            //val_ret = this.limite - val_ret
            val_ret = this.limite + val_ret;
            System.out.println("Val ret" + val_ret);
            this.limite = val_ret;
        }else {
            System.out.println("Saldo insuficiente");
        }
        
    }

    //this.saldo + valor
    public void depositar(float valor) {
        this.saldo = this.saldo + valor;
    }
    // Método getter do atributo Saldo
    public float getSaldo(){
        return this.saldo + this.limite;
    }
    
}
/*
Existem somente 3 modificadores (private, protected e public), e com isso temos 4 níveis de visibilidade
Os níveis são os que você disse: private, default, protected e public.
Private: A única classe que tem acesso ao atributo é a própria classe que o define, ou seja, se uma classe Pessoa declara um atributo privado chamado nome, somente a classe Pessoa terá acesso a ele.
---------------------------------------
Default: Tem acesso a um atributo default (identificado pela ausência de modificadores) todas as classes que estiverem no mesmo pacote que a classe que possui o atributo.
---------------------------------------
Protected: Esse é o que pega mais gente, ele é praticamente igual ao default, com a diferença de que se uma classe (mesmo que esteja fora do pacote) estende da classe com o atributo protected, ela terá acesso a ele. Então o acesso é por pacote e por herança.
---------------------------------------
Public: Esse é fácil, todos tem acesso :) 

*/