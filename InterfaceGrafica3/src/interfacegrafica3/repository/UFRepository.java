/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica3.repository;
import interfacegrafica3.model.UF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class UFRepository implements Crud<UF>{

    @Override
    public boolean inserir(Connection connection, UF uf) {
       PreparedStatement stmt = null;
        try{
            String comando = "INSERT INTO uf(nome, sigla) " +
                             "VALUES(?, ?)";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, uf.getNome());
            stmt.setString(2, uf.getSigla());
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao inserir pessoa: " + ex.getMessage(),
                    "Erro ao inserir",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
        
    }

    @Override
    public boolean atualizar(Connection connection, UF uf) {
       PreparedStatement stmt = null;
        try{
            String comando = "UPDATE uf SET " +
                             "nome = ?, sigla = ?" +
                             "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setString(1, uf.getNome());
            stmt.setString(2, uf.getSigla());
            stmt.setInt(3, uf.getId());
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao atualizar uf: " + ex.getMessage(),
                    "Erro ao atualizar",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }        
    }

    @Override
    public boolean deletar(Connection connection, UF uf) {
        PreparedStatement stmt = null;
        try{
            String comando = "DELETE FROM uf " +
                             "WHERE id = ?";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, uf.getId());
            stmt.executeUpdate();
            stmt.close();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao excluir uf: " + ex.getMessage(),
                    "Erro ao excluir",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }        
    }

    @Override
    public UF selecionar(Connection connection, String operador, int id) {
       try{
            UF uf = new UF();
            PreparedStatement stmt = null;
            String comando = "SELECT * FROM uf WHERE id " + 
                             operador + " ? ";
            if(operador.equals("<"))
                comando += " ORDER BY id DESC";
            stmt = connection.prepareStatement(comando);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();
            if(res != null){
                while(res.next()){
                    uf.setId(Integer.parseInt(res.getString("id") ));
                    uf.setNome(res.getString("nome"));
                    uf.setSigla(res.getString("sigla"));                 
                    break;
                }
            }
            return uf;
        }catch(Exception ex){
            
            return null;
        } 
    }
    public List<UF> selecionarTodos(Connection connection, int id){
        try{
            List<UF> cadastroUf = new ArrayList<>();
            PreparedStatement stmt = null;
            
            String comando = "SELECT * FROM uf ORDER BY nome DESC";
            
            stmt = connection.prepareStatement(comando);
            ResultSet res = stmt.executeQuery();
            
            while(res.next()){
                UF uf = new UF();
                uf.setSigla(res.getString("sigla"));
                
                
                cadastroUf.add(uf);   
            }
            return cadastroUf;

        }catch(Exception ex){
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
