/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

/**
 *
 * @author gustavo
 */
public class UF {
    private String nome;
    private String sigla;
    private int id;

    public UF(String nome, String sigla, int id) {
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;
    }
    
    public UF(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    
}
