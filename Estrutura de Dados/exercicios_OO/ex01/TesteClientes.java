package exercicios_OO.ex01;

public class TesteClientes{

    public static void main(String[] args) {
        
    Cliente joao =  new Cliente("joão da silva", "Rua da Paz,45");
    Cliente maria =  new Cliente("Maria da Silva", "Rua da Paz,45");

    Conta conta_joao = new Conta(1, 100.0f, 200.0f);
    Conta conta_maria = new Conta(2, 300.0f, 500.0f);

    System.out.println("Saldo do João(Antes do saque): " + conta_joao.getsaldo);
    System.out.println("Saldo da Maria: " + conta_maria.getSaldo);

    conta_joao.sacar(300);
    System.out.println("Saldo do João (Depois do saque!)");

    conta_maria.sacar(150);
    System.out.println("Saldo do João (Depois do saque): ");

}

}


    