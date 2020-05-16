public class Aplicacao {
    public static void main(String[] args){
        CDicionario dicionario = new CDicionario();

        dicionario.put("MG", new CDicionario());
        dicionario.put("SP", new CDicionario());
        dicionario.put("RJ", new CDicionario());

        ((CDicionario) dicionario.get("MG")).put("PARTIDO A", new CLista());
        ((CDicionario) dicionario.get("SP")).put("PARTIDO B", new CLista());
        ((CDicionario) dicionario.get("RJ")).put("PARTIDO C", new CLista());

        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).add("NOME 1");
        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).add("NOME 2");
        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).add("NOME 3");
        
        ((CLista)((((CDicionario) dicionario.get("SP")).get("PARTIDO B")))).add("NOME 4");
        ((CLista)((((CDicionario) dicionario.get("SP")).get("PARTIDO B")))).add("NOME 5");
        ((CLista)((((CDicionario) dicionario.get("SP")).get("PARTIDO B")))).add("NOME 6");

        ((CLista)((((CDicionario) dicionario.get("RJ")).get("PARTIDO C")))).add("NOME 7");
        ((CLista)((((CDicionario) dicionario.get("RJ")).get("PARTIDO C")))).add("NOME 8");
        ((CLista)((((CDicionario) dicionario.get("RJ")).get("PARTIDO C")))).add("NOME 9");


        ((CDicionario) dicionario.get("MG")).print();
        ((CLista)((((CDicionario) dicionario.get("MG")).get("PARTIDO A")))).print();

        ((CDicionario) dicionario.get("SP")).print();
        ((CLista)((((CDicionario) dicionario.get("SP")).get("PARTIDO B")))).print();

        ((CDicionario) dicionario.get("RJ")).print();
        ((CLista)((((CDicionario) dicionario.get("RJ")).get("PARTIDO C")))).print();
    }
}