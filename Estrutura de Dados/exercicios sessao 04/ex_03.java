/*Faça um algoritmo utilizando o comando While que mostra uma contagem regressiva
na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem "Fim!" apó a contagem.
*/

public class ex_03{
    public static void main(String[] args) {
        int cont = 11;

        while(cont > 0){
            cont--;
            System.out.println(cont);    
        }
        System.out.println("FIM!");
    }
}

