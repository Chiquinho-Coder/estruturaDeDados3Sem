
package estruturaestatica;


public class Estruturaestatica<T> {
    public T[] elementos;
    public int tamanho;
    // metodo construtor com parametro
    public Estruturaestatica(int capacidade){
    this.elementos = (T[]) new Object[capacidade];
    this.tamanho = 0;
    }
    
    //metodo construtor sem parametro
    public Estruturaestatica(){
            this(10);
    
    }
    
   //metodo para adicionar elemento
    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
    if(this.tamanho < this.elementos.length){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
    }
    return false;
    }

    //metodo para adicionar em qualquer posicao 
    public boolean adiciona(int posicao, T elemento) {
    if (!(posicao >=0 && posicao < tamanho)){
        throw new IllegalArgumentException("Posicao Invalida");
    }
    this.aumentaCapacidade();
    for(int i=this.tamanho-1; i>=posicao; i--){
        this.elementos[i+1] = this.elementos[i];
    }
    this.elementos[posicao] = elemento;
    this.tamanho++;
    
    return true;
    }
    //metodo para aumentar a capacidade do vetor 
    public void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i=0; i<this.elementos.length; i++) {
                    elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
    
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }
        
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
    
    public boolean estaVazia(){
    return this.tamanho == 0;
    
    }
    
    public void remove(int posicao){
    if (!(posicao >=0 && posicao < tamanho)){
        throw new IllegalArgumentException("Posicao Invalida");
    }
    for (int i=posicao; i<tamanho-1; i++){
        elementos[i] = elementos[i+1];
    }
    tamanho --;
    }
}
