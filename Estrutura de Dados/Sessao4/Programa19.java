package Sessao4;
//Matrizes parte 2

//As matrizes tem tamanho fixo e não podem ser alterados
public class Programa19 {
    public static void main(String[] args) {
        
        int numeros[][] = new int [3] [3];
        numeros [0] [0] = 1;
        numeros [0] [1] = 3;
        numeros [0] [2] = 5;
        numeros [1] [0] = 7;
        numeros [1] [1] = 9;
        numeros [1] [2] = 11;
        numeros [2] [0] = 13;
        numeros [2] [1] = 15;
        numeros [2] [2] = 17;

        //System.out.println(numeros[1][2]);

        for(int i = 0; i < numeros.length; i++) { //numeros.length = tamanho das linhas = 3
            for(int j = 0; j < numeros[i].length; j++){ // numeros.legth = tamanho das colunas = 3
                numeros[i][j] = i + j * 2;
            }
        }
        for(int i = 0; i < numeros.length; i++) { //numeros.length = tamanho das linhas = 3
            for(int j = 0; j < numeros[i].length; j++){ // numeros.legth = tamanho das colunas = 3
                System.out.println("numeros[" + 1 + "][" + j + "] = " + numeros[i][j]);
            }
        }
    }
    
}
