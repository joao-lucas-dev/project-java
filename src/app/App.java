    package app;
    import java.util.*;

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
        public static int count_selection_5 = 0;
        public static int count_selection_10 = 0;
        public static int count_selection_50 = 0;
        public static int count_selection_100 = 0;
        public static int count_selection_1000 = 0;
        public static int count_selection_10000 = 0;

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
            System.out.println("----------------------------------------");
            return c;
        }

        public static int selectionSort(int Array[]) {
            int i, n, eleito, min, pos, c;
            c = 0;
            // Percorrer o array e ordenar o números em forma crescente
            for (i = 0; i < Array.length - 1; i++) {
                eleito = Array[i];
                min = Array[i + 1];
                pos = i + 1;
    
                // Percorrer o array a partir do próximo número, sem ser o da variável
                // min, para saber qual o menor número
                for (n = i + 2; n < Array.length; n++) {
                    if(Array[n] < min) {
                        min = Array[n];
                        pos = n;
                    }
                    c++;
                }
                // Caso o for acima não ache nenhum número menor que o da variável min,
                // irá ter uma comparação entre o min e o n˚ eleito para saber quem é
                // menor
                if (min < eleito) {
                    Array[i] = Array[pos];
                    Array[pos] = eleito;
                    c++;
                }
            }
            System.out.println("\n\n----------------------------------------");
            System.out.println("\nResultado:\n");
            // Exibir os valores do array
            for(i = 0; i < Array.length; i++) {
                System.out.println((i+1)+"˚ número: "+ Array[i]);
            }
            System.out.println("----------------------------------------");
    
            return c;
        }
        
        public static void substituir(int Y[], int i, int j) {
            int a;
            /*troca os valores de i e j */
            a=Y[i];
            Y[i]=Y[j];
            Y[j]=a;
        }
        
        public static int separar(int Y[], int esq, int dir) {
            int pivo, i , j;
            /*define o pivo como elemento central do vetor*/
            pivo = Y[(esq+dir)/2];
            /*atribui valores as variaveis auxiliares*/
            i=esq-1;
            j=dir+1;

            while (i<j) 
            {
                /*Executará o loop enquanto a ouver elementos do vetor
                a direita maiores que o pivo */
                do
                {
                    j-=1;
                }
                while(Y[j]>pivo);
                /*Executará o loop enquanto a ouver elementos do vetor
                a esquerda menores que o pivo */
                do 
                {
                    i+=1;
                }
                while (Y[i]<pivo);
                /*iniciará a função substituir quando a variavel auxiliar
                i for maior que a variavel auxiliar j */
                if (i<j) 
                {
                    substituir(Y,i,j);    
                }            
            }
            return j;
        }
        
            public static void quickSort (int Y[], int esq, int dir) {
            int q, i;
            /*inicia  a comparação entre os valores na primeira e ultima posição do
            vetor*/
            if (esq<dir) {
                /*inicia o metodo separar */ 
                q=separar(Y,esq,dir);
                /*por meio de recursão faz a releitura do metodo quickSort para cada
                novo membro criado apos a separação do vetor inicial desta vez com os
                elementos a esquerda do pivô e em seguida com os elementos a direita do
                pivô*/
                quickSort(Y, esq, q);
                quickSort(Y, q+1, dir);
            }
            }
    
            static void exibeOrdenado(int Y[]) 
            { 
                /*Exibe na tela o vetor solicitado */
                int n = Y.length; 
                System.out.println("Vetor Ordenado: ");
                for (int i=0; i<n; ++i) 
                    System.out.print(Y[i]+" "); 
                System.out.println(); 
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
                vt_tam_5_1[i] = gerador.nextInt(10000);
                vt_tam_5_2[i] = gerador.nextInt(10000);
                vt_tam_5_3[i] = gerador.nextInt(10000);
                vt_tam_5_4[i] = gerador.nextInt(10000);
                vt_tam_5_5[i] = gerador.nextInt(10000);
                vt_tam_5_6[i] = gerador.nextInt(10000);
                vt_tam_5_7[i] = gerador.nextInt(10000);
                vt_tam_5_8[i] = gerador.nextInt(10000);
            }

            for (int i = 0; i < TAM_10; i++) {
                vt_tam_10_1[i] = gerador.nextInt(10000);
                vt_tam_10_2[i] = gerador.nextInt(10000);
                vt_tam_10_3[i] = gerador.nextInt(10000);
                vt_tam_10_4[i] = gerador.nextInt(10000);
                vt_tam_10_5[i] = gerador.nextInt(10000);
                vt_tam_10_6[i] = gerador.nextInt(10000);
                vt_tam_10_7[i] = gerador.nextInt(10000);
                vt_tam_10_8[i] = gerador.nextInt(10000);
            }

            for (int i = 0; i < TAM_50; i++) {
                vt_tam_50_1[i] = gerador.nextInt(10000);
                vt_tam_50_2[i] = gerador.nextInt(10000);
                vt_tam_50_3[i] = gerador.nextInt(10000);
                vt_tam_50_4[i] = gerador.nextInt(10000);
                vt_tam_50_5[i] = gerador.nextInt(10000);
                vt_tam_50_6[i] = gerador.nextInt(10000);
                vt_tam_50_7[i] = gerador.nextInt(10000);
                vt_tam_50_8[i] = gerador.nextInt(10000);
            }

            for (int i = 0; i < TAM_100; i++) {
                vt_tam_100_1[i] = gerador.nextInt(10000);
                vt_tam_100_2[i] = gerador.nextInt(10000);
                vt_tam_100_3[i] = gerador.nextInt(10000);
                vt_tam_100_4[i] = gerador.nextInt(10000);
                vt_tam_100_5[i] = gerador.nextInt(10000);
                vt_tam_100_6[i] = gerador.nextInt(10000);
                vt_tam_100_7[i] = gerador.nextInt(10000);
                vt_tam_100_8[i] = gerador.nextInt(10000);
            }

            for (int i = 0; i < TAM_1000; i++) {
                vt_tam_1000_1[i] = gerador.nextInt(10000);
                vt_tam_1000_2[i] = gerador.nextInt(10000);
                vt_tam_1000_3[i] = gerador.nextInt(10000);
                vt_tam_1000_4[i] = gerador.nextInt(10000);
                vt_tam_1000_5[i] = gerador.nextInt(10000);
                vt_tam_1000_6[i] = gerador.nextInt(10000);
                vt_tam_1000_7[i] = gerador.nextInt(10000);
                vt_tam_1000_8[i] = gerador.nextInt(10000);
            }

            for (int i = 0; i < TAM_10000; i++) {
                vt_tam_10000_1[i] = gerador.nextInt(10000);
                vt_tam_10000_2[i] = gerador.nextInt(10000);
                vt_tam_10000_3[i] = gerador.nextInt(10000);
                vt_tam_10000_4[i] = gerador.nextInt(10000);
                vt_tam_10000_5[i] = gerador.nextInt(10000);
                vt_tam_10000_6[i] = gerador.nextInt(10000);
                vt_tam_10000_7[i] = gerador.nextInt(10000);
                vt_tam_10000_8[i] = gerador.nextInt(10000);
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

            //  Array[5]
        System.out.println("----------------ARRAY[5]-------------------");
        count_selection_5 += selectionSort(vt_tam_5_1);
        count_selection_5 += selectionSort(vt_tam_5_2);
        count_selection_5 += selectionSort(vt_tam_5_3);
        count_selection_5 += selectionSort(vt_tam_5_4);
        count_selection_5 += selectionSort(vt_tam_5_5);
        count_selection_5 += selectionSort(vt_tam_5_6);
        count_selection_5 += selectionSort(vt_tam_5_7);
        count_selection_5 += selectionSort(vt_tam_5_8);
        
        //  Array[10]
        System.out.println("----------------ARRAY[10]-------------------");
        count_selection_10 += selectionSort(vt_tam_10_1);
        count_selection_10 += selectionSort(vt_tam_10_2);
        count_selection_10 += selectionSort(vt_tam_10_3);
        count_selection_10 += selectionSort(vt_tam_10_4);
        count_selection_10 += selectionSort(vt_tam_10_5);
        count_selection_10 += selectionSort(vt_tam_10_6);
        count_selection_10 += selectionSort(vt_tam_10_7);
        count_selection_10 += selectionSort(vt_tam_10_8);
        
        //  Array[50]
        System.out.println("----------------ARRAY[50]-------------------");
        count_selection_50 += selectionSort(vt_tam_50_1);
        count_selection_50 += selectionSort(vt_tam_50_2);
        count_selection_50 += selectionSort(vt_tam_50_3);
        count_selection_50 += selectionSort(vt_tam_50_4);
        count_selection_50 += selectionSort(vt_tam_50_5);
        count_selection_50 += selectionSort(vt_tam_50_6);
        count_selection_50 += selectionSort(vt_tam_50_7);
        count_selection_50 += selectionSort(vt_tam_50_8);
        
        //  Array[100]
        System.out.println("----------------ARRAY[100]-------------------");
        count_selection_100 += selectionSort(vt_tam_100_1);
        count_selection_100 += selectionSort(vt_tam_100_2);
        count_selection_100 += selectionSort(vt_tam_100_3);
        count_selection_100 += selectionSort(vt_tam_100_4);
        count_selection_100 += selectionSort(vt_tam_100_5);
        count_selection_100 += selectionSort(vt_tam_100_6);
        count_selection_100 += selectionSort(vt_tam_100_7);
        count_selection_100 += selectionSort(vt_tam_100_8);
        
        //  Array[1000]
        System.out.println("----------------ARRAY[1000]-------------------");
        count_selection_1000 += selectionSort(vt_tam_1000_1);
        count_selection_1000 += selectionSort(vt_tam_1000_2);
        count_selection_1000 += selectionSort(vt_tam_1000_3);
        count_selection_1000 += selectionSort(vt_tam_1000_4);
        count_selection_1000 += selectionSort(vt_tam_1000_5);
        count_selection_1000 += selectionSort(vt_tam_1000_6);
        count_selection_1000 += selectionSort(vt_tam_1000_7);
        count_selection_1000 += selectionSort(vt_tam_1000_8);
        
        //  Array[10000]
        System.out.println("----------------ARRAY[10000]-------------------");
        count_selection_10000 += selectionSort(vt_tam_10000_1);
        count_selection_10000 += selectionSort(vt_tam_10000_2);
        count_selection_10000 += selectionSort(vt_tam_10000_3);
        count_selection_10000 += selectionSort(vt_tam_10000_4);
        count_selection_10000 += selectionSort(vt_tam_10000_5);
        count_selection_10000 += selectionSort(vt_tam_10000_6);
        count_selection_10000 += selectionSort(vt_tam_10000_7);
        count_selection_10000 += selectionSort(vt_tam_10000_8);

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
            System.out.println("\n- Selection Sort:\n");
            System.out.println("Média de vezes executado (Array[5]): " + count_selection_5 / 8);
            System.out.println("Média de vezes executado (Array[10]): " + count_selection_10 / 8);
            System.out.println("Média de vezes executado (Array[50]): " + count_selection_50 / 8);
            System.out.println("Média de vezes executado (Array[100]): " + count_selection_100 / 8);
            System.out.println("Média de vezes executado (Array[1000]): " + count_selection_1000 / 8);
            System.out.println("Média de vezes executado (Array[10000]): " + count_selection_10000 / 8);
            


        }
    }