package src;

class CDicionario {
    private CCelulaDicionario primeira;
    private CCelulaDicionario ultima;

    public CDicionario() {
        primeira = new CCelulaDicionario();
        ultima = primeira;
    }

    public boolean vazio() {
        return primeira == ultima;
    }

    public void adiciona(Object chave, Object valor) {
        ultima.prox = new CCelulaDicionario(chave, valor);
        ultima = ultima.prox;
    }

    public Object procuraValor(Object chave) {
        CCelulaDicionario aux = primeira.prox;
        boolean achou = false;

        while (aux != null && !achou){
            if (achou = aux.equals(chave)){
                achou = true;
                return aux;
            }
            aux = aux.prox; 
        }
        return achou;
    }
    public boolean procuraValorFor(Object elemento) {
        boolean achou = false;
        for (CCelulaDicionario aux = primeira.prox; aux != null && !achou; aux = aux.prox)
           achou = aux.value.equals(elemento);
        return achou;
     }

    public void imprimeFor() {
        for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
           System.out.print(aux.value + " " + aux.key + " .. ");   		
     }
}