
package metodosOrdenacao;


public class InsertionSort {
    public static void main(String[] args) {
        //criar vetor com 10 posicoes
        int[] vetor = new int[10];
        
        //inserir valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            //exibindo os valores do vetor
            System.out.println(vetor[i]);
            
        }
        
        int aux, j;
        for (int i = 0; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j>= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor [j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        
        //exibindo vetor ordenado
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            
        }
    }
    
}
