package aedtp;

public class CDicionario {
    private CCelulaDicionario primeira;
    private CCelulaDicionario ultima;

    public CDicionario() {
        primeira = new CCelulaDicionario();
        ultima = primeira;
    }

    public boolean vazio() {
        return primeira == ultima;
    }

    public void adicionaMorador(Object chave, Object valor) {
        ultima.prox = new CCelulaDicionario(chave, valor);
        ultima = ultima.prox;
    }

    public Object procuraChave(Object chave) {
        CCelulaDicionario aux = primeira.prox;
        boolean achou = false;

        while (aux != null && !achou){
            if (achou = aux.key.equals(chave)){
                achou = true;
                return aux;
            }
            aux = aux.prox; 
        }
        return "Não encontrado.\n";
    }

    public void imprimeFor() {
        for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
           System.out.print("Value: " + aux.value + "Key: " + aux.key + " ---> ");   		
     }
     

    public boolean procuraValorFor(Object elemento) {
        boolean achou = false;
        for (CCelulaDicionario aux = primeira.prox; aux != null && !achou; aux = aux.prox)
           achou = aux.value.equals(elemento);
        return achou;
     }
}
