package Sessao4;
//Vetores Parte 2
public class Programa17 {
    public static void main(String[] args) {
        //Declaração e definição de tamanho do vetor
        int numeros[] = new int[10];
        System.out.println("Tamanho do vetor: " + numeros.length);

        for(int i = 0; i < numeros.length; i++); { //length devolve o tamanho do vetor(array) no caso (10)
            //numeros[0] = I + 3
           // numeros[i] = i + 3;
            //Numeros[9] = 1 + 3;
        }
        System.out.println(numeros[0]); //Primeiro elemento
        System.out.println(numeros[9]); //Último elemento

        //0..9
        //numeros[10] = 42;
        //System.out.println(numeros[10]);
        /*
            OS vetores/Arrays possuem tamanho fixo e não podem ser aumentados/diminuídos
        */

        numeros[0] = 7;
        System.out.println(numeros[0]); //primeiro elemento

        //numeros[0] = 23.4f;
        /*
            Os vetores/arrays possuem tipos de dados fixos e não aceitam tipos variados
        */

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.round(Math.random() * 10); //Random recebe um valor em double e arredonda para inteiro //Math = Biblioteca matemática
           }
            System.out.println(numeros[0]); //Primeiro elemento
            System.out.println(numeros[9]); //Último elemento

        //FOREACH

        for (int i : numeros) {
            System.out.println(i);
            
        }

        }
    }

