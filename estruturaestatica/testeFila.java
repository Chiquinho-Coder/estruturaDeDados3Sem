
package estruturaestatica;

public class testeFila {
    
    public static void main(String[] args){
    Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        //Vamos verificar se a fila esta vazia, nesse caso sera false
       // System.out.println("A fila está vazia? " + fila.estaVazia());
        
        //Vamos verificar o tamanho da minha fila após enfileiras
        //System.out.println("Qual o tamanho da fila: " + fila.tamanho());
        
        //Vamos visualizar os elementos dentro da fila
        //System.out.println(fila.toString());
    
        
        //Vamos espiar a fila
        //System.out.println(fila.espiar());
        //poderiamos criar uma estrutura de decisao com o retorno do metodo
        /*if (fila.espiar() == null){
            System.out.println("Ninguem na Fila");
        } else {
            System.out.println("O elemento da primeira posicao est " + fila.espiar());
        */
        
        //Vamos visualizar a fila
        System.out.println(fila.toString());
        
        //Vamos desenfileirar um elemento
        System.out.println(fila.desenfileira());
        
        //Vamos visualizar a fila novamente apos remover um elemento
        System.out.println(fila.toString());
        
    
    
    }
    
    
    
}



/*
 _
  ( \                ..-----..__
   \.'.        _.--'`  [   '  ' ```'-._
    `. `'-..-'' `    '  ' '   .  ;   ; `-'''-.,__/|/_
      `'-.;..-''`|'  `.  '.    ;     '  `    '   `'  `,
                 \ '   .    ' .     '   ;   .`   . ' 7 \
                  '.' . '- . \    .`   .`  .   .\     `Y
                    '-.' .   ].  '   ,    '    /'`""';:'
                      /Y   '.] '-._ /    ' _.-'
                      \'\_   ; (`'.'.'  ."/
                       ' )` /  `.'   .-'.'
                        '\  \).'  .-'--"
                          `. `,_'`
                            `.__)
*/
