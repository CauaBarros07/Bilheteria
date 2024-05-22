/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.projetobilheteria.Classes;

/**
 *
 * @author vitor
 */
public class MetodoPagamento {
    public int id;
    
    public String nome;
    
    public static MetodoPagamento criar(int pid,String pnome){
     MetodoPagamento objeto = new MetodoPagamento();
     objeto.id = pid;
     objeto.nome = pnome;
             
               
     
     return objeto;
    }
}

