public class Aplicacao {
    public static void main(String[] args){
        CDicionario dicionario = new CDicionario();
        
        dicionario.put("MG", new CDicionario());
        dicionario.put("SP", new CDicionario());
        dicionario.put("RJ", new CDicionario());


        ((CDicionario) dicionario.get("MG")).put("A", new CLista());
        ((CDicionario) dicionario.get("SP")).put("B", new CLista());
        ((CDicionario) dicionario.get("RJ")).put("C", new CLista());

        ((CLista)((CDicionario) dicionario.get("MG")).get("A")).add("NOME 1");
        ((CLista)((CDicionario) dicionario.get("MG")).get("A")).add("NOME 2");
        ((CLista)((CDicionario) dicionario.get("MG")).get("A")).add("NOME 3");
        ((CLista)((CDicionario) dicionario.get("MG")).get("A")).add("teste 1");
        ((CLista)((CDicionario) dicionario.get("MG")).get("A")).add("TESTE 2");
        ((CLista)((CDicionario) dicionario.get("MG")).get("A")).add("TESTE 3");

        ((CLista)((CDicionario) dicionario.get("SP")).get("B")).add("NOME 4");
        ((CLista)((CDicionario) dicionario.get("SP")).get("B")).add("NOME 5");
        ((CLista)((CDicionario) dicionario.get("SP")).get("B")).add("NOME 6");

        ((CLista)((CDicionario) dicionario.get("RJ")).get("C")).add("NOME 7");
        ((CLista)((CDicionario) dicionario.get("RJ")).get("C")).add("NOME 8");
        ((CLista)((CDicionario) dicionario.get("RJ")).get("C")).add("NOME 9");



        dicionario.printEstado("MG");
        
        ((CDicionario) dicionario.get("MG")).print();
        ((CLista)(((CDicionario) dicionario.get("MG")).get("A"))).print();

        dicionario.printEstado("SP");
        ((CDicionario) dicionario.get("SP")).print();
        ((CLista)(((CDicionario) dicionario.get("SP")).get("B"))).print();

        dicionario.printEstado("RJ");
        ((CDicionario) dicionario.get("RJ")).print();
        ((CLista)(((CDicionario) dicionario.get("RJ")).get("C"))).print();   
        








        // for (int i = 0; i < 3; i++){
        //     System.out.println("ESTADOS");
        //     for (int x=0; x < 3; x++)
        //         System.out.println("    PARTIDOS");
        //             for(int z=0; z < 3; z++)
        //                 System.out.println("        DEPUTADOS");
        // }

    }
}