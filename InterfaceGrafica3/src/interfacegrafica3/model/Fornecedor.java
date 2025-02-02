/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.model;

/**
 *
 * @author gustavo
 */
public class Fornecedor extends PessoaJuridica{
    private int idFornecedor;
    private String nomeFornecedor;
    private String email;
    private String endereco;
    private String telefone;
    private String categoria;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, String nomeFornecedor, String email, String endereco, String telefone, String categoria, String cnpj, String inscricaoEstadual, String nomeFantasia, String nome, String sigla, int id) {
        super(cnpj, inscricaoEstadual, nomeFantasia, nome, sigla, id);
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

    @Override
    public String toString() {
         return "Nome: "     + this.nomeFornecedor + "\n" +
               "Endereco: " + this.endereco + "\n" +
               "Telefone: " + this.telefone + "\n" + 
               "E-mail: "   + this.email +
               "Categoria: "   + this.categoria +
               "Estado: " + super.getNome() + 
               "UF: " + super.getSigla();
    }

    
    
    
    

}
