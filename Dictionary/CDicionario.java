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

	public Object get(Object key) {

		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
			if (key.equals(aux.chave))
				return aux.valor;
		}
		return key;
	}

	public void print(){
        for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.println("  Partido " +aux.chave);
	}

	public void printEstado(String estado){
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			if (estado == aux.chave)
			System.out.println("Estado " + aux.chave);
	}

}
