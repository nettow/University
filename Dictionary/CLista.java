// Fornecido por Rodrigo Richard Gomes

public class CLista {

   private CCelula primeira;
   private CCelula ultima;
   private int qtde;

   public CLista() {
       primeira = new CCelula();
       ultima = primeira;
   }

   public void add(Object valorItem) {
       ultima.prox = new CCelula(valorItem);
       ultima = ultima.prox;
       qtde++;
   }

   public void print() {
       for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
           System.out.print("    Deputado " + aux.item + "\n");
        System.out.println();
   }

   public Object retornaDeputados(String partido) {
       for (CCelula aux = primeira.prox; aux != null; aux = aux.prox) {
        // NOTHING YET
       }
       
       return "NOTHING YET";
   }

   
   public boolean contem(Object elemento) {
       boolean achou = false;
       for (CCelula aux = primeira.prox; aux != null && !achou; aux = aux.prox)
           achou = aux.item.equals(elemento);
       return achou;
   }

   public int quantidade() {
       return qtde;
   }

}