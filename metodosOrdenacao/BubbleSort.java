
package metodosOrdenacao;


public class BubbleSort {

    
    public static void main(String[] args) {
        // criar vetor com 10 num
        int[] vetor = new int[10];
        
        // inserir valor no vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // exibir vetor 
            System.out.println(vetor[i]);
            
        }
        
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
        
        //exibir vetor ordenado
        System.out.println("Nosso vetor ordenado: ");
        for (int i = 0; i < vetor.length ; i++) {
            System.out.println(vetor[i]);
            
        }
    }
    
}
