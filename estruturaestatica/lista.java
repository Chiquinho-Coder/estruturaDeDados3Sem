
package estruturaestatica;


public class lista<T> extends Estruturaestatica<T> {
    //metodo construtor com parametro o super pq esta herdado
    public lista(int capacidade){
        super(capacidade);
    }
    //metodo construtor sem paramentos
    public lista(){
        super();
    }
    
    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }
    
    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}
