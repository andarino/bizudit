package editordetexto;





import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.List;

public class Funcoes {

    public String repeticoesPalavras(String a) {

        
        
        
        
        
        a = this.tirarPontuacao(a);
        String b[] = a.split(" ");
       
        //System.out.println(a);
        
        int cont = 0;

        //System.out.print("Digite a palavra que quer procurar:  ");
        //String palavra=teclado.next();
        
        List<PalavrasRepetidas> listPalav = new ArrayList();
       // HashMap<String, Integer> map = new HashMap<>();
        for (String b1 : b) {
            PalavrasRepetidas pa=new PalavrasRepetidas();
            cont = 0;
            for (String b2 : b) {
                if (b1.equals(b2)) {
                    cont++;
                }
            }
            pa.setNome(b1);
            pa.setQtd(cont);
            int igual=0;
            for (int k = 0; k < listPalav.size(); ++k) {
                if(b1.equals(listPalav.get(k).getNome())){
                    igual=1;
                }
                
            }
            if(igual==0){
            listPalav.add(pa);
            }
            //map.put(b1, cont); //aqui esta adicionando as´palavras e a quantidade q elas repetem
        }
        String g="";
        String repeticoes = "";
        Collections.sort(listPalav);
        
        for (int k = (listPalav.size()-15); k < listPalav.size(); ++k) {
           // System.out.println(listPalav);
           //System.out.println(listPalav.get(k).getNome()+"= "+listPalav.get(k).getQtd());
            if(g.equals(listPalav.get(k).getNome())){
        
        // System.out.println(map.toString());
           }else{
                repeticoes=listPalav.get(k).getNome()+"= "+listPalav.get(k).getQtd()+"\n"+repeticoes;
                
                g=listPalav.get(k).getNome();
               // map.put(listPalav.get(k).getNome(), listPalav.get(k).getQtd());
            }
        }
        //System.out.println(map.toString());
        //return map.toString();
        return repeticoes;
        

    }
    
    public String tirarPontuacao(String texto){
        
       
       texto=texto.replaceAll(" a ", " ");
       texto=texto.replaceAll(" com ", " ");
       texto=texto.replaceAll(" em ", " ");
       texto=texto.replaceAll(" por ", " ");
       texto=texto.replaceAll(" ante ", " ");
       texto=texto.replaceAll(" contra ", " ");
       texto=texto.replaceAll(" entre ", " ");
       texto=texto.replaceAll(" sem ", " ");
       texto=texto.replaceAll(" após ", "");
       texto=texto.replaceAll(" de ", " ");
       texto=texto.replaceAll(" para ", " ");
       texto=texto.replaceAll(" sob ", " ");
       texto=texto.replaceAll(" até ", " ");
       texto=texto.replaceAll(" desde ", " ");
       texto=texto.replaceAll(" perante ", " ");
       texto=texto.replaceAll(" sobre ", " ");
       texto=texto.replaceAll(" e ", " ");
       texto=texto.replaceAll(" os ", " ");
       texto=texto.replaceAll(" as ", " ");
       texto=texto.replaceAll(" aquelas ", " ");
       texto=texto.replaceAll(" o ", " ");
       texto=texto.replaceAll(" é ", " ");
       texto=texto.replaceAll(" um ", " ");
       texto=texto.replaceAll("O ", "");
       texto=texto.replaceAll("A ", "");
       texto=texto.replaceAll(" ou ", " ");
       texto=texto.replaceAll(" se ", " ");
       texto=texto.replaceAll(" que ", " ");
       texto=texto.replaceAll(" da ", " ");
      
       texto=texto.replaceAll(" na ", " ");
       texto=texto.replaceAll(" do ", " ");
       texto=texto.replaceAll(" dos ", " ");
       texto=texto.replaceAll(" nas ", " ");
       texto=texto.replaceAll(" das ", " ");
       texto=texto.replaceAll(" no ", " ");
       texto=texto.replaceAll(" umas ", " ");
       texto=texto.replaceAll(" uns ", " ");
       texto=texto.replaceAll("Os ", " ");
       texto=texto.replaceAll("As ", " ");
       texto=texto.replaceAll("É ", " ");
       texto=texto.replaceAll(" uma ", " ");
       texto=texto.replaceAll(" este ", " ");
       texto=texto.replaceAll(" ao ", " ");
       texto=texto.replaceAll(" mais ", " ");
       texto=texto.replaceAll(" mas ", " ");
       texto=texto.replaceAll(" como ", " ");
       texto=texto.replaceAll(" pelo ", " ");
       texto=texto.replaceAll(" seu ", " ");
       texto=texto.replaceAll(" sua ", " ");
       texto=texto.replaceAll(" seus ", " ");
       texto=texto.replaceAll(" suas ", " ");
       texto=texto.replaceAll(" ela ", " ");
       texto=texto.replaceAll(" ele ", " ");
       texto=texto.replaceAll(" eles ", " ");
       texto=texto.replaceAll(" quando ", " ");
       texto=texto.replaceAll(" como ", " ");
       texto=texto.replaceAll(" já ", " ");
       texto=texto.replaceAll(" dele ", " ");
       texto=texto.replaceAll(" dela ", " ");
       texto=texto.replaceAll("Ele ", " ");
       texto=texto.replaceAll("Ela ", " ");
       
       
       texto=texto.replaceAll("0", "");
       texto=texto.replaceAll("1", "");
       texto=texto.replaceAll("2", "");
       texto=texto.replaceAll("3", "");
       texto=texto.replaceAll("4", "");
       texto=texto.replaceAll("5", "");
       texto=texto.replaceAll("6", "");
       texto=texto.replaceAll("7", "");
       texto=texto.replaceAll("8", "");
       texto=texto.replaceAll("9", "");
       
       
       
       texto=texto.replace("  ", " ");
       texto=texto.replaceAll("\\p{Punct}", "");
       texto=texto.replace("  ", " ");
       
       
                                                                          
                                                    
                                                            
                                                   
      //  String result = str.replaceAll("\\p{Punct}", "");
        return texto;
        
        
    }
    
    

}
