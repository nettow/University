public class Aplicacao {
    public static void main(String[] args){
        String[] estados = {"MG","SP","RJ"};

        CDicionario dicionario = new CDicionario();

        // Cria partidos e dicionario terá chave= partidos e valor= CLista
        dicionario.put("MG", new CDicionario());
        dicionario.put("SP", new CDicionario());
        dicionario.put("RJ", new CDicionario());

        // Insere partidos como chave e cria CLista no valor
        ((CDicionario) dicionario.get("MG")).put("Pao de queijo", new CLista());
        ((CDicionario) dicionario.get("SP")).put("Pao com mortadela", new CLista());
        ((CDicionario) dicionario.get("RJ")).put("Capirinha", new CLista());

        // Insere na lista os nomes dos deputados
        ((CLista)((CDicionario) dicionario.get("MG")).get("Pao de queijo")).add("NOME 1");
        ((CLista)((CDicionario) dicionario.get("MG")).get("Pao de queijo")).add("NOME 2");
        ((CLista)((CDicionario) dicionario.get("MG")).get("Pao de queijo")).add("NOME 3");
        // Insere na lista os nomes dos deputados
        ((CLista)((CDicionario) dicionario.get("SP")).get("Pao com mortadela")).add("NOME 4");
        ((CLista)((CDicionario) dicionario.get("SP")).get("Pao com mortadela")).add("NOME 5");
        ((CLista)((CDicionario) dicionario.get("SP")).get("Pao com mortadela")).add("NOME 6");
        // Insere na lista os nomes dos deputados
        ((CLista)((CDicionario) dicionario.get("RJ")).get("Capirinha")).add("NOME 7");
        ((CLista)((CDicionario) dicionario.get("RJ")).get("Capirinha")).add("NOME 8");
        ((CLista)((CDicionario) dicionario.get("RJ")).get("Capirinha")).add("NOME 9");

        // Ao executar: Comente as outras questões

        // Questão 1
        // Imprime estados, partidos e deputados
        dicionario.printEstado(estados,0);
        ((CDicionario) dicionario.get("MG")).print();
        ((CLista)(((CDicionario) dicionario.get("MG")).get("Pao de queijo"))).print();

        dicionario.printEstado(estados,1);
        ((CDicionario) dicionario.get("SP")).print();
        ((CLista)(((CDicionario) dicionario.get("SP")).get("Pao com mortadela"))).print();

        dicionario.printEstado(estados,2);
        ((CDicionario) dicionario.get("RJ")).print();
        ((CLista)(((CDicionario) dicionario.get("RJ")).get("Capirinha"))).print();


        // Questao 2 - importa dicionario
        CDicionario dic = new CDicionario();
        dic.put(100, "Joao");                    
        dicionario.importaDicionario(dic);

        // Questao 2 - retorna deputados
        dicionario.retornaDeputados("Pao de queijo");
    }
}