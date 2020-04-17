package aedtp;
//Fornecido por Rodrigo Richard Gomes
public class CCelulaDicionario {
    // Atributos
    public Object key, value;
    public CCelulaDicionario prox;

    // Construtora que anula os tr�s atributos da c�lula
    public CCelulaDicionario() {
        key = null;
        value = null;
        prox = null;
    }

    // Construtora que inicializa key e value com os argumentos passados
    // por par�metro e anula a refer�ncia � pr�xima c�lula
    public CCelulaDicionario(Object chave, Object valor) {
        key = chave;
        value = valor;
        prox = null;
    }

    // Construtora que inicializa todos os atribulos da c�lula com os argumentos
    // passados por par�metro
    public CCelulaDicionario(Object chave, Object valor, CCelulaDicionario proxima) {
        key = chave;
        value = valor;
        prox = proxima;
    }
}
