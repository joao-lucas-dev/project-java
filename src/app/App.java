package app;
import java.util.Random;

public class App {
    public static final int TAM_5 = 5;
    public static final int TAM_10 = 10;
    public static final int TAM_50 = 50;
    public static final int TAM_100 = 100;
    public static final int TAM_1000 = 1000;
    public static final int TAM_10000 = 10000;
    public static int count_bubble_5 = 0;
    public static int count_bubble_10 = 0;
    public static int count_bubble_50 = 0;
    public static int count_bubble_100 = 0;
    public static int count_bubble_1000 = 0;
    public static int count_bubble_10000 = 0;

    public static int bubbleSort(int Array[]) {
        int i, n, aux, c;
        c = 0;
        // Percorrer o array e ordenar o números em forma crescente
        for(n = 0; n < Array.length; n++) {
            for(i = 0; i < Array.length - 1; i++) {
                // Número atual maior que o próximo número,
                // haverá troca de posição entre eles
                if(Array[i] > Array[i+1]) {
                    aux = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i+1] = aux;
                }
                c++;
            }
        }
        System.out.println("\n\n----------------------------------------");
        System.out.println("\nResultado:\n");
        // Exibir os valores do array
        for(i = 0; i < Array.length; i++) {
            System.out.println((i+1)+"˚ número: "+ Array[i]);
        }
        System.out.println("\nQuantas vezes foi executado: " + c);
        System.out.println("----------------------------------------");
        return c;
    }

    public static void main(String[] args) {
        // Cria 8 vetores de tamanho 5
        int vt_tam_5_1[] = new int[TAM_5];
        int vt_tam_5_2[] = new int[TAM_5];
        int vt_tam_5_3[] = new int[TAM_5];
        int vt_tam_5_4[] = new int[TAM_5];
        int vt_tam_5_5[] = new int[TAM_5];
        int vt_tam_5_6[] = new int[TAM_5];
        int vt_tam_5_7[] = new int[TAM_5];
        int vt_tam_5_8[] = new int[TAM_5];

        // Cria 8 vetores de tamanho 10
        int vt_tam_10_1[] = new int[TAM_10];
        int vt_tam_10_2[] = new int[TAM_10];
        int vt_tam_10_3[] = new int[TAM_10];
        int vt_tam_10_4[] = new int[TAM_10];
        int vt_tam_10_5[] = new int[TAM_10];
        int vt_tam_10_6[] = new int[TAM_10];
        int vt_tam_10_7[] = new int[TAM_10];
        int vt_tam_10_8[] = new int[TAM_10];

        // Cria 8 vetores de tamanho 50
        int vt_tam_50_1[] = new int[TAM_50];
        int vt_tam_50_2[] = new int[TAM_50];
        int vt_tam_50_3[] = new int[TAM_50];
        int vt_tam_50_4[] = new int[TAM_50];
        int vt_tam_50_5[] = new int[TAM_50];
        int vt_tam_50_6[] = new int[TAM_50];
        int vt_tam_50_7[] = new int[TAM_50];
        int vt_tam_50_8[] = new int[TAM_50];

        // Cria 8 vetores de tamanho 100
        int vt_tam_100_1[] = new int[TAM_100];
        int vt_tam_100_2[] = new int[TAM_100];
        int vt_tam_100_3[] = new int[TAM_100];
        int vt_tam_100_4[] = new int[TAM_100];
        int vt_tam_100_5[] = new int[TAM_100];
        int vt_tam_100_6[] = new int[TAM_100];
        int vt_tam_100_7[] = new int[TAM_100];
        int vt_tam_100_8[] = new int[TAM_100];

        // Cria 8 vetores de tamanho 1.000
        int vt_tam_1000_1[] = new int[TAM_1000];
        int vt_tam_1000_2[] = new int[TAM_1000];
        int vt_tam_1000_3[] = new int[TAM_1000];
        int vt_tam_1000_4[] = new int[TAM_1000];
        int vt_tam_1000_5[] = new int[TAM_1000];
        int vt_tam_1000_6[] = new int[TAM_1000];
        int vt_tam_1000_7[] = new int[TAM_1000];
        int vt_tam_1000_8[] = new int[TAM_1000];

        // Cria 8 vetores de tamanho 10.000
        int vt_tam_10000_1[] = new int[TAM_10000];
        int vt_tam_10000_2[] = new int[TAM_10000];
        int vt_tam_10000_3[] = new int[TAM_10000];
        int vt_tam_10000_4[] = new int[TAM_10000];
        int vt_tam_10000_5[] = new int[TAM_10000];
        int vt_tam_10000_6[] = new int[TAM_10000];
        int vt_tam_10000_7[] = new int[TAM_10000];
        int vt_tam_10000_8[] = new int[TAM_10000];
        // instancia um objeto da classe Random usando o construtor básico
        Random gerador = new Random();

        // gera sequência de 5 números inteiros aleatórios entre 0 e 5
        for (int i = 0; i < TAM_5; i++) {
            vt_tam_5_1[i] = gerador.nextInt(6);
            vt_tam_5_2[i] = gerador.nextInt(6);
            vt_tam_5_3[i] = gerador.nextInt(6);
            vt_tam_5_4[i] = gerador.nextInt(6);
            vt_tam_5_5[i] = gerador.nextInt(6);
            vt_tam_5_6[i] = gerador.nextInt(6);
            vt_tam_5_7[i] = gerador.nextInt(6);
            vt_tam_5_8[i] = gerador.nextInt(6);
        }

        for (int i = 0; i < TAM_10; i++) {
            vt_tam_10_1[i] = gerador.nextInt(6);
            vt_tam_10_2[i] = gerador.nextInt(6);
            vt_tam_10_3[i] = gerador.nextInt(6);
            vt_tam_10_4[i] = gerador.nextInt(6);
            vt_tam_10_5[i] = gerador.nextInt(6);
            vt_tam_10_6[i] = gerador.nextInt(6);
            vt_tam_10_7[i] = gerador.nextInt(6);
            vt_tam_10_8[i] = gerador.nextInt(6);
        }

        for (int i = 0; i < TAM_50; i++) {
            vt_tam_50_1[i] = gerador.nextInt(6);
            vt_tam_50_2[i] = gerador.nextInt(6);
            vt_tam_50_3[i] = gerador.nextInt(6);
            vt_tam_50_4[i] = gerador.nextInt(6);
            vt_tam_50_5[i] = gerador.nextInt(6);
            vt_tam_50_6[i] = gerador.nextInt(6);
            vt_tam_50_7[i] = gerador.nextInt(6);
            vt_tam_50_8[i] = gerador.nextInt(6);
        }

        for (int i = 0; i < TAM_100; i++) {
            vt_tam_100_1[i] = gerador.nextInt(6);
            vt_tam_100_2[i] = gerador.nextInt(6);
            vt_tam_100_3[i] = gerador.nextInt(6);
            vt_tam_100_4[i] = gerador.nextInt(6);
            vt_tam_100_5[i] = gerador.nextInt(6);
            vt_tam_100_6[i] = gerador.nextInt(6);
            vt_tam_100_7[i] = gerador.nextInt(6);
            vt_tam_100_8[i] = gerador.nextInt(6);
        }

        for (int i = 0; i < TAM_1000; i++) {
            vt_tam_1000_1[i] = gerador.nextInt(6);
            vt_tam_1000_2[i] = gerador.nextInt(6);
            vt_tam_1000_3[i] = gerador.nextInt(6);
            vt_tam_1000_4[i] = gerador.nextInt(6);
            vt_tam_1000_5[i] = gerador.nextInt(6);
            vt_tam_1000_6[i] = gerador.nextInt(6);
            vt_tam_1000_7[i] = gerador.nextInt(6);
            vt_tam_1000_8[i] = gerador.nextInt(6);
        }

        for (int i = 0; i < TAM_10000; i++) {
            vt_tam_10000_1[i] = gerador.nextInt(6);
            vt_tam_10000_2[i] = gerador.nextInt(6);
            vt_tam_10000_3[i] = gerador.nextInt(6);
            vt_tam_10000_4[i] = gerador.nextInt(6);
            vt_tam_10000_5[i] = gerador.nextInt(6);
            vt_tam_10000_6[i] = gerador.nextInt(6);
            vt_tam_10000_7[i] = gerador.nextInt(6);
            vt_tam_10000_8[i] = gerador.nextInt(6);
        }
        
        // Chamada para ordernar os vetores de tamanho 5
        // Bubble
        // Calcula a média de comparações: (comparacao1 + comparacao2 + ... + comparacao8) / 8
        // Imprime ou salva em arquivo para ajudar a montar o gráfico do relatório
        
        //  Array[5]
        System.out.println("----------------ARRAY[5]-------------------");
        count_bubble_5 += bubbleSort(vt_tam_5_1);
        count_bubble_5 += bubbleSort(vt_tam_5_2);
        count_bubble_5 += bubbleSort(vt_tam_5_3);
        count_bubble_5 += bubbleSort(vt_tam_5_4);
        count_bubble_5 += bubbleSort(vt_tam_5_5);
        count_bubble_5 += bubbleSort(vt_tam_5_6);
        count_bubble_5 += bubbleSort(vt_tam_5_7);
        count_bubble_5 += bubbleSort(vt_tam_5_8);
        
        //  Array[10]
        System.out.println("----------------ARRAY[10]-------------------");
        count_bubble_10 += bubbleSort(vt_tam_10_1);
        count_bubble_10 += bubbleSort(vt_tam_10_2);
        count_bubble_10 += bubbleSort(vt_tam_10_3);
        count_bubble_10 += bubbleSort(vt_tam_10_4);
        count_bubble_10 += bubbleSort(vt_tam_10_5);
        count_bubble_10 += bubbleSort(vt_tam_10_6);
        count_bubble_10 += bubbleSort(vt_tam_10_7);
        count_bubble_10 += bubbleSort(vt_tam_10_8);
        
        //  Array[50]
        System.out.println("----------------ARRAY[50]-------------------");
        count_bubble_50 += bubbleSort(vt_tam_50_1);
        count_bubble_50 += bubbleSort(vt_tam_50_2);
        count_bubble_50 += bubbleSort(vt_tam_50_3);
        count_bubble_50 += bubbleSort(vt_tam_50_4);
        count_bubble_50 += bubbleSort(vt_tam_50_5);
        count_bubble_50 += bubbleSort(vt_tam_50_6);
        count_bubble_50 += bubbleSort(vt_tam_50_7);
        count_bubble_50 += bubbleSort(vt_tam_50_8);
        
        //  Array[100]
        System.out.println("----------------ARRAY[100]-------------------");
        count_bubble_100 += bubbleSort(vt_tam_100_1);
        count_bubble_100 += bubbleSort(vt_tam_100_2);
        count_bubble_100 += bubbleSort(vt_tam_100_3);
        count_bubble_100 += bubbleSort(vt_tam_100_4);
        count_bubble_100 += bubbleSort(vt_tam_100_5);
        count_bubble_100 += bubbleSort(vt_tam_100_6);
        count_bubble_100 += bubbleSort(vt_tam_100_7);
        count_bubble_100 += bubbleSort(vt_tam_100_8);
        
        //  Array[1000]
        System.out.println("----------------ARRAY[1000]-------------------");
        count_bubble_1000 += bubbleSort(vt_tam_1000_1);
        count_bubble_1000 += bubbleSort(vt_tam_1000_2);
        count_bubble_1000 += bubbleSort(vt_tam_1000_3);
        count_bubble_1000 += bubbleSort(vt_tam_1000_4);
        count_bubble_1000 += bubbleSort(vt_tam_1000_5);
        count_bubble_1000 += bubbleSort(vt_tam_1000_6);
        count_bubble_1000 += bubbleSort(vt_tam_1000_7);
        count_bubble_1000 += bubbleSort(vt_tam_1000_8);
        
        //  Array[10000]
        System.out.println("----------------ARRAY[10000]-------------------");
        count_bubble_10000 += bubbleSort(vt_tam_10000_1);
        count_bubble_10000 += bubbleSort(vt_tam_10000_2);
        count_bubble_10000 += bubbleSort(vt_tam_10000_3);
        count_bubble_10000 += bubbleSort(vt_tam_10000_4);
        count_bubble_10000 += bubbleSort(vt_tam_10000_5);
        count_bubble_10000 += bubbleSort(vt_tam_10000_6);
        count_bubble_10000 += bubbleSort(vt_tam_10000_7);
        count_bubble_10000 += bubbleSort(vt_tam_10000_8);
        
        // Selection
        // Calcula a média de comparações
        // Imprime ou salva em arquivo para ajudar a montar o gráfico do relatório

        // Insertion
        // Calcula a média de comparações
        // Imprime ou salva em arquivo para ajudar a montar o gráfico do relatório

        // Merge
        // Calcula a média de comparações
        // Imprime ou salva em arquivo para ajudar a montar o gráfico do relatório

        // Quick
        // Calcula a média de comparações
        // Imprime ou salva em arquivo para ajudar a montar o gráfico do relatório

        System.out.println("\n\n--- Todas as médias");
        System.out.println("\n- Bubble Sort:\n");
        System.out.println("Média de vezes executado (Array[5]): " + count_bubble_5 / 8);
        System.out.println("Média de vezes executado (Array[10]): " + count_bubble_10 / 8);
        System.out.println("Média de vezes executado (Array[50]): " + count_bubble_50 / 8);
        System.out.println("Média de vezes executado (Array[100]): " + count_bubble_100 / 8);
        System.out.println("Média de vezes executado (Array[1000]): " + count_bubble_1000 / 8);
        System.out.println("Média de vezes executado (Array[10000]): " + count_bubble_10000 / 8);
        
    }
}