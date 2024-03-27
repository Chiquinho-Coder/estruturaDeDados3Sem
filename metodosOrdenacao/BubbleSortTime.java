
package metodosOrdenacao;


public class BubbleSortTime {
    
    public static void main(String[] args) {
        // criar vetor com x num
        int[] vetor = new int[500000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            
        }
        
        //variavel q registra tempo de execucao no inicio
        long inicio = System.currentTimeMillis();
        
        // método de ordenaçao bubblesort
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]){;
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
            
        }
        
        // variavel para registrar o tempo de execucao
        long fim = System.currentTimeMillis();
        
        // exibindo o tempo de exec
        System.out.println("Tempo de execucao: "+ (fim-inicio));
            
        
    
    }
}
