package com.unicv.aulas.projetobilheteria.classes;

/**
 *
 * @author pedro
 */
public class Estado {
    public int id;
    public String sigla;
    public String nome;

    public Estado(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public static Estado criar(int pId, String pNome, String pSigla){
        return new Estado(pId, pNome, pSigla);
    }
}
