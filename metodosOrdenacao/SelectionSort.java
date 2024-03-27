
package metodosOrdenacao;


public class SelectionSort {
    public static void main(String[] args) {
        //criando vetor com 10 posicoes
        int[] vetor = new int[10];
        
        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            //exibindo os valores
            System.out.println(vetor[i]);
        }
        
        //metodo de ordenacao SelectionSort
        int menor_posicao, aux;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = i; j < vetor.length; j++) {
                if(vetor[j] < vetor[menor_posicao]){
                    menor_posicao = j;
                }
            }
            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;
            
        }
        
        //exibir o vetor ordenado
        System.out.println("Nosso vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
