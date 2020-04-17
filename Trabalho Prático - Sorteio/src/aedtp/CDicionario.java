package aedtp;

public class CDicionario {
    private CCelulaDicionario primeira;
    private CCelulaDicionario ultima;

    public CDicionario() {
        primeira = new CCelulaDicionario();
        ultima = primeira;
    }

    public void adicionaMorador(Object chave, Object valor) {
        ultima.prox = new CCelulaDicionario(chave, valor);
        ultima = ultima.prox;
	}
	
    public void procuraCpf(String cpf) {
    	String[] data;
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if(cpf.equals(data[1])) {
    			System.out.println("CPF: " + data[1] + "    NOME: " + data[0] + "\nQtde Dependentes: " + data[5] + " - Renda familiar: " + data[4] +  "\nTelefone: " + data[4] + "\nEndereco: " + data[3]);
    			return;
    		}
    	}
    	System.out.println("Usu�rio n�o existe!");
    }

    public void imprimirListagemSimples() {
        String[] data; // String[] data = {this.getNome(),this.getCpf(),this.getTelefone(),this.getEndereco(),rendaStr,dependentesStr,faixaStr,isEsperaStr};
        System.out.println("LISTAGEM DE MORADORES\n================================\nFAIXA 1\n");
        
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("1".equals(data[6])) {
    			System.out.println("CPF: " + data[1] + " - NOME: " + data[0] + "- Renda familiar:" + data[4] + "\n");
    		}
    	}
        System.out.println("================================\nFAIXA 2\n");
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("2".equals(data[6])) {
    			System.out.println("CPF: " + data[1] + " - NOME: " + data[0] + " Faixa:" + data[6] + "\n");
    		}
    	}
    }
    
    public void imprimirListagemCompleta() {
        String[] data;
        System.out.println("LISTAGEM DE MORADORES\n================================\r\nFAIXA 1");
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("1".equals(data[6])) {
    			// 		String[] data = {this.getNome(),this.getCpf(),this.getTelefone(),this.getEndereco(),rendaStr,dependentesStr,faixaStr,isEsperaStr};
    			System.out.println("CPF: " + data[1] + "    NOME: " + data[0] + "\nQtde Dependentes: " + data[5] + " - Renda familiar: " + data[4] +  "\nTelefone: " + data[4] + "\nEndereco: " + data[3]);
    		}
        }
        System.out.println("================================\r\nFAIXA 2");
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("2".equals(data[6])) {
    			// 		String[] data = {this.getNome(),this.getCpf(),this.getTelefone(),this.getEndereco(),rendaStr,dependentesStr,faixaStr,isEsperaStr};
    			System.out.println("CPF: " + data[1] + "    NOME: " + data[0] + "\nQtde Dependentes: " + data[5] + " - Renda familiar: " + data[4] +  "\nTelefone: " + data[4] + "\nEndereco: " + data[3]);
    		}
        }
    }
}
