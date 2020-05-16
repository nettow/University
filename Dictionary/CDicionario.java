public class CDicionario {
	private CCelulaDicionario primeira;
	private CCelulaDicionario ultima;

	public CDicionario() {
		primeira = new CCelulaDicionario();
		ultima = primeira;
	}

	public void put(Object key, Object value) {
		ultima.prox = new CCelulaDicionario(key, value);
		ultima = ultima.prox;
	}

	public Object get(Object cpf) {

		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
			if (cpf.equals(aux.chave)) {
				return aux.valor;
			}
		}
		return cpf;
	}

	public void print(Object valor){
        for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
			System.out.println(aux.chave +"\n");
        }
    }
}
