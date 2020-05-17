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

	public void printEstado(String[] estados,int posicao){
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			if (estados[posicao] == aux.chave)
			System.out.println("Estado " + aux.chave);
	}
	
	// Questão 2

	public void importaDicionario(CDicionario dicionario){
		put((dicionario.ultima).chave, (dicionario.ultima).valor);
		
		System.out.println("Foi importado o aluno com\nMatricula: " +(dicionario.ultima).chave);
		System.out.println("Nome: " + (dicionario.ultima).valor);
	}

	public void retornaDeputados(String partido){
        for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox){
			if ((((CDicionario)(aux.valor)).ultima).chave == partido)
			((CLista)(((CDicionario)(aux.valor)).ultima).valor).print();
		}
	}
}
