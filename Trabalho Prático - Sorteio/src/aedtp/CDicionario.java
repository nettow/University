package aedtp;

public class CDicionario {
    private CCelulaDicionario primeira;
    private CCelulaDicionario ultima;
	private CFila filaEspera = new CFila();
	
    public CDicionario() {
        primeira = new CCelulaDicionario();
        ultima = primeira;
    }

    public void adicionaMorador(Object chave, Object valor) {
        ultima.prox = new CCelulaDicionario(chave, valor);
        ultima = ultima.prox;
    }
    
    public void procuraCpf(String cpf) {
    	String[] data; // data = {Nome,Cpf,Telefone,Endereco,Renda,Dependentes,Faixa,isEspera,isDeletado};
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if(cpf.equals(data[1])) {
    			System.out.println("CPF: " + data[1] + "    NOME: " + data[0] + "\nQtde Dependentes: " + data[5] + " - Renda familiar: " + data[4] +  "\nTelefone: " + data[4] + "\nEndereco: " + data[3]);
    			return;
    		}
    	}
    	System.out.println("Usu�rio n�o existe!");
    }

    public String excluirMorador(String cpf) {
        String[] data; // data = {Nome,Cpf,Telefone,Endereco,Renda,Dependentes,Faixa,isEspera,isDeletado};
        String faixa;
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if (cpf.equals(data[1])) {
    			data[8] = "true";
    			faixa = data[6];
    			for (int i=0; i<= 7;i++) {
    				data[i] = null;
    			}
    			System.out.println("Morador " + data[0] +" excluido.");
    			
    	    	return faixa;
    		}
    	}
    	return "error";
    }
    
    public void imprimirListagemSimples() {
        String[] data; //data = {Nome,Cpf,Telefone,Endereco,Renda,Dependentes,Faixa,isEspera,isDeletado};
        System.out.println("LISTAGEM DE MORADORES\n================================\nFAIXA 1\n");
        
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("1".equals(data[6]) && "false".equals(data[8])) {
    			System.out.println("CPF: " + data[1] + " - NOME: " + data[0] + "- Renda familiar:" + data[4] + "\n");
    		}
    	}
    	
        System.out.println("================================\nFAIXA 2\n");
        
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("2".equals(data[6]) && "false".equals(data[8])) {
    			System.out.println("CPF: " + data[1] + " - NOME: " + data[0] + "- Renda familiar:" + data[4] + "\n");
    		}
    	}
    }
    
    public void imprimirListagemCompleta() {
        String[] data; // data = {Nome,Cpf,Telefone,Endereco,Renda,Dependentes,Faixa,isEspera,isDeletado};
        System.out.println("LISTAGEM DE MORADORES\n================================\r\nFAIXA 1");
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("1".equals(data[6]) && "false".equals(data[8])) {
    			System.out.println("CPF: " + data[1] + "    NOME: " + data[0] + "\nQtde Dependentes: " + data[5] + " - Renda familiar: " + data[4] +  "\nTelefone: " + data[4] + "\nEndereco: " + data[3]);
    		}
        }
    	
        System.out.println("================================\r\nFAIXA 2");
        
    	for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox) {
    		data = (String[]) aux.value;
    		if ("2".equals(data[6]) && "false".equals(data[8])) {
    			// 		String[] data = {this.getNome(),this.getCpf(),this.getTelefone(),this.getEndereco(),rendaStr,dependentesStr,faixaStr,isEsperaStr};
    			System.out.println("CPF: " + data[1] + "    NOME: " + data[0] + "\nQtde Dependentes: " + data[5] + " - Renda familiar: " + data[4] +  "\nTelefone: " + data[4] + "\nEndereco: " + data[3]);
    		}
        }
    }
    
    public void adicionaEspera(String cpf) {
    	filaEspera.enfileira(cpf);
    }
    
}
