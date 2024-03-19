
package ado1;


//vetor principal
public class Vetor {
    private Carro[] carros;
    private int tamanho;

    
    //cria a capacidade do vetor
    public Vetor(int capacidade) {
        carros = new Carro[capacidade];
        tamanho = 0;
    }

    public void adicionarCarro(Carro carro) {
        if (tamanho < carros.length) {
            carros[tamanho] = carro;
            tamanho++;
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    public void exibirCarros() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Carro " + (i + 1) + ": " + carros[i]);
        }
    }

    // adicionar: removerCarro, buscarCarro e alterarCarro.
}

