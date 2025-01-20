/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.repository;

import interfacegrafica3.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class FornecedorRepository implements Crud<Fornecedor>{
    
    public FornecedorRepository(){
        
    }

    public Fornecedor selecionar(int id){
        return null;
    }
    
    @Override
    public boolean inserir(Connection connection, Fornecedor fornecedor) {
        PreparedStatement stmt = null;
        try{
            String comando = "INSERT INTO fornecedor(nome, email, endereco, uf, telefone, cnpj, inscricao_estadual, nome_fantasia, categoria) " +
                             "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setString(4, fornecedor.getUF());
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCNPJ());
            stmt.setString(7, fornecedor.getInscricaoEstadual());
            stmt.setString(8, fornecedor.getNomeFantasia());
            stmt.setString(9, fornecedor.getCategoria());
            
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao inserir fornecedor: " + ex.getMessage(),
                    "Erro ao inserir",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }
    
    @Override
    public boolean atualizar(Connection connection, Fornecedor fornecedor) {
        PreparedStatement stmt = null;
        try{
            String comando = "UPDATE fornecedor SET " +
                             "nome = ?, email = ?, endereco = ?, uf = ?, telefone = ?, cnpj = ?, inscricao_estadual = ?, nome_fantasia = ?, categoria = ? " +
                             "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getEmail());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setString(4, fornecedor.getUF());
            stmt.setString(5, fornecedor.getTelefone());
            stmt.setString(6, fornecedor.getCNPJ());
            stmt.setString(7, fornecedor.getInscricaoEstadual());
            stmt.setString(8, fornecedor.getNomeFantasia());
            stmt.setString(9, fornecedor.getCategoria());
            stmt.setInt(10, fornecedor.getId());
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao atualizar fornecedor: " + ex.getMessage(),
                    "Erro ao atualizar",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }        
    }

    @Override
    public boolean deletar(Connection connection, Pessoa pessoa) {
        PreparedStatement stmt = null;
        try{
            String comando = "DELETE FROM cadastro_pessoa " +
                             "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, pessoa.getId());
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao excluir pessoa: " + ex.getMessage(),
                    "Erro ao excluir",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }        
    }

    @Override
    public Pessoa selecionar(Connection connection, String operador, int id) {
        try{
            Pessoa pessoa = new Pessoa();
            PreparedStatement stmt = null;
            String comando = "SELECT * FROM cadastro_pessoa WHERE id " + 
                             operador + " ? ";
            if(operador.equals("<"))
                comando += " ORDER BY id DESC";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();
            if(res != null){
                while(res.next()){
                    pessoa.setId(Integer.parseInt(res.getString("id") ));
                    pessoa.setNome(res.getString("nome"));
                    pessoa.setEndereco(res.getString("endereco"));
                    pessoa.setTelefone(res.getString("telefone"));
                    pessoa.setEmail(res.getString("email"));                    
                    break;
                }
            }
            return pessoa;
        }catch(Exception ex){
            
            return null;
        }
    }
    
}
