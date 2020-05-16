// Fornecido por Rodrigo Richard Gomes
public class CCelulaDicionario {
    
    public Object chave, valor;
    public CCelulaDicionario prox;
    public CCelulaDicionario() {
        chave = null;
        valor = null;
        prox = null;
    }

    public CCelulaDicionario(Object key, Object value) {
        chave = key;
        valor = value;
        prox = null;
    }

    public CCelulaDicionario(Object key, Object value, CCelulaDicionario proxima) {
        chave = key;
        valor = value;
        prox = proxima;
    }

}
