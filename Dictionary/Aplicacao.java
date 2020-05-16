public class Aplicacao {
    public static void main(String[] args){
        CDicionario dicionario = new CDicionario();

        dicionario.put("MG", new CDicionario());

        ((CDicionario) dicionario.get("MG")).put("PARTIDO A", new CLista());

        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).add("NOME 1");
        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).add("NOME 2");
        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).add("NOME 3");
        
    }
}