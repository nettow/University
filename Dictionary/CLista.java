// Fornecido por Rodrigo Richard Gomes

public class CLista {

   private CCelula primeira;
   private CCelula ultima;

   public CLista() {
       primeira = new CCelula();
       ultima = primeira;
   }

   public void add(Object valorItem) {
       ultima.prox = new CCelula(valorItem);
       ultima = ultima.prox;
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
}