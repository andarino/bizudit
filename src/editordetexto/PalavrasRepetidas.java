/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editordetexto;


public class PalavrasRepetidas implements Comparable<PalavrasRepetidas>{
    private String nome;
    private int qtd;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    
    public int compareTo(PalavrasRepetidas t) {
        if (this.qtd < t.getQtd()) {
return -1;
}
if (this.qtd > t.getQtd()) {
return 1;
}
return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
}
