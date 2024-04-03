
package lista;

import java.util.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        
        lista.add("Napoleao");
        lista.add("Juca Bala");
        lista.add("Mr Lapadite");
        lista.add("Cornelio");
        lista.add("Sr. Senhor");
        lista.add("Czar III");
        lista.add("Muad'dib");
        lista.add("Eu :D");
        
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.size());
        System.out.println("Inicio da lista = " + lista.getFirst());
        System.out.println("Fim da lista = " + lista.getLast());
        System.out.println("Buscar informacao na 2nd posicao da lista: " + lista.get(2));
        System.out.println("Buscar o nome Cornelio na lista: " + lista.contains("Cornelio"));
        lista.remove(2);
        lista.remove("Muad'dib");
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.size());
    }
}
