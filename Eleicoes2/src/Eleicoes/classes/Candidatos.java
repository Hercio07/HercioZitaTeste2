/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eleicoes.classes;

import java.io.Serializable;
import java.util.ArrayList;


public class Candidatos implements Serializable {
    
   private String nome;
   private int bi;
   private String historico;

   ArrayList<Voto> voto = new ArrayList<>();
    public Candidatos() {
    }
    

    public Candidatos(String nome, int bi, String historico) {
        this.nome = nome;
        this.bi = bi;
        this.historico = historico;
    }

    public Candidatos(String nome, String bi, String historico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Candidatos{" + "nome=" + nome + ", bi=" + bi + 
                                               ", historico=" + historico + '}';
    }
    
   
   
}
