
package lista;


//classe para testes das funções de ListaEncadeada.java

public class Lista {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        
        
        
        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        
        lista.remover("Elis");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        
        
    }
}
