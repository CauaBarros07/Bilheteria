/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicv.aulas.projetobilheteria.classes;

/**
 *
 * @author pedro
 */
public class MetodoPagamento {
    public int id;
    public String nome;

    public MetodoPagamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static MetodoPagamento criar(int id, String nome) {
        return new MetodoPagamento(id, nome);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}