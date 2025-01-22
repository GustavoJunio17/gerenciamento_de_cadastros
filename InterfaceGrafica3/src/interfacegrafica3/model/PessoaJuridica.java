/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

/**
 *
 * @author gustavo
 */
public class PessoaJuridica extends Fornecedor {
    private String cnpj;
    private String inscricaoEstadual;
    private String nomeFantasia; 

    public PessoaJuridica() {
        
    }

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String nomeFantasia) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    @Override
    public String toString() {
         return "Nome: "     + super.getNomeFornecedor() + "\n" +
               "Endereco: " + super.getEndereco() + "\n" +
               "Telefone: " + super.getTelefone() + "\n" + 
               "E-mail: "   + super.getEmail() +
               "Categoria: "   + super.getCategoria() +
               "Estado: " + super.getNome() + 
               "UF: " + super.getSigla() + 
               "CNPJ: " + this.cnpj +
               "Inscrição Estadual: " + this.inscricaoEstadual + 
               "Nome Fantasia: " + this.nomeFantasia;
    }
}
