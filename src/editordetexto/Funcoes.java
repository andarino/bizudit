package editordetexto;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.io.LineNumberReader;
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
            listPalav.add(pa);
            
            //map.put(b1, cont); //aqui esta adicionando as´palavras e a quantidade q elas repetem
        }
        String g="";
        String repeticoes = "";
        Collections.sort(listPalav);
        
        for (int k = 0; k < listPalav.size(); ++k) {
           // System.out.println(listPalav);
           //System.out.println(listPalav.get(k).getNome()+"= "+listPalav.get(k).getQtd());
            if(g.equals(listPalav.get(k).getNome())){
        
        // System.out.println(map.toString());
            }else{
                repeticoes=listPalav.get(k).getNome()+"= "+listPalav.get(k).getQtd()+"\n"+repeticoes;
                
                g=listPalav.get(k).getNome();
                //map.put(listPalav.get(k).getNome(), listPalav.get(k).getQtd());
            }
        }
        //System.out.println(map.toString());
        //return map.toString();
        return repeticoes;
        

    }
    
    public String tirarPontuacao(String texto){
        texto=texto.replaceAll("\\p{Punct}", "");
      //  String result = str.replaceAll("\\p{Punct}", "");
        return texto;
        
        
    }

}
