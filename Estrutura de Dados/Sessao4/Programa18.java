package Sessao4;
//Matrizes parte 1

/*
Vetores/Arrays/Matrizes multi-dimensionais

//Vetor
int numeros[5];
numeros[0] = 3;
numeros[1] = 2;
numeros[2] = 5;

//Matriz
[Linhas] [Colunas]
int numeros [3] [3]

numeros[0] [0] = 1;
numeros[0] [1] = 2;
numeros[0] [2] = 5;       1 2 5
numeros[1] [0] = 7;      
numeros[1] [1] = 4; ====  7 4 9
numeros[1] [2] = 9;
numeros[2] [0] = 3;       3 6 12
numeros[2] [1] = 6;
numeros[2] [2] = 32;

*/
public class Programa18 {
    public static void main(String[] args) {
        //Declaração
        int outros_numeros[][];

        //Declaração e definição da Matriz
        int numeros[] [] = new int[3][3];

        //Declarar, definir tamanho e inicializar
        int mais_numeros[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        //Declarar uma matriz informando somente as linhas 
        int matriz[][] =  new int[2][];
        matriz[0] = new int[5]; // informando as colunas somente depois de informar as linhas
        matriz[1] = new int[3]; // informando as colunas somente depois de informar as linhas

        int nova_matriz[][] = { {1,2}, {4, 5, 6, 7, 8}, {9, 10, 11} };
        
        
    }
}
