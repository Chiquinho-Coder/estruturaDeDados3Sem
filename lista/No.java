
package lista;

public class No<Tipo> {
    private Tipo elemento;
    private No<Tipo> proximo;
    
    public No(Tipo elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(Tipo elemento, No<Tipo> proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    /**
     * @return the elemento
     */
    public Tipo getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the proximo
     */
    public No<Tipo> getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No<Tipo> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + ", proximo=" + proximo + '}'; 
    }
    
    





}

