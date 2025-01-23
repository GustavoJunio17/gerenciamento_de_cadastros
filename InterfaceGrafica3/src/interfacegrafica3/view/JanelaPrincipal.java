/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package interfacegrafica3.view;

import interfacegrafica3.model.Pessoa;
import interfacegrafica3.repository.Conexao;
import interfacegrafica3.repository.ConexaoMySQL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

/**
 *
 * @author gustavo
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    JanelaCadastro janelaCadastro;
    JanelaCadastroUF janelaCadastroUF;
    JanelaCadastroFornecedor janelaCadastroFornecedor;
    public List<Pessoa> lstPessoa;
    public int ultimoId;
    private Conexao conexao;
    public ConexaoMySQL conexaoMySQL;
    
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        lstPessoa = new ArrayList<>();
        ultimoId = 0;
        conexao = new Conexao(
                "localhost",
                "root",
                "admin",
                3306,
                "cadastro"
        );
        conexaoMySQL = new ConexaoMySQL(conexao);
        conexaoMySQL.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        openMenuItem1 = new javax.swing.JMenuItem();
        menuCadatroFornecedor = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('a');
        fileMenu.setText("Arquivo");

        openMenuItem.setMnemonic('c');
        openMenuItem.setText("Cadastro");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        openMenuItem1.setMnemonic('u');
        openMenuItem1.setText("Cadastro de UF");
        openMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem1);

        menuCadatroFornecedor.setMnemonic('f');
        menuCadatroFornecedor.setText("Cadastro Fornecedor");
        menuCadatroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadatroFornecedorActionPerformed(evt);
            }
        });
        fileMenu.add(menuCadatroFornecedor);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('j');
        helpMenu.setText("Ajuda");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        //menu cadastro pessoa
        try{
            janelaCadastro = JanelaCadastro.getInstancia(this);
            if(!desktopPane.isAncestorOf(janelaCadastro)){
                desktopPane.add("JanelaCadastro", janelaCadastro);
                janelaCadastro.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                int x = (getDesktopPane().getWidth() - janelaCadastro.getWidth()) / 2;
                int y = (getDesktopPane().getHeight() - janelaCadastro.getHeight()) / 2;
                janelaCadastro.setLocation(x, y);
            }
            
            janelaCadastro.setSelected(true);
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, 
                    "Erro ao abrir a tela de cadastro de clientes: ",
                    "Cadastro de clientes",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        //exibir a qte de dados da lista:
        JOptionPane.showMessageDialog(
                this,
                "Qte de pessoas: " + lstPessoa.size(),
                "Cadastro de clientes",
                JOptionPane.INFORMATION_MESSAGE
        );
        //imprimir todos os registros da minha lista:
        for(int i = 0; i < lstPessoa.size(); i++){
            Pessoa p = lstPessoa.get(i);
            JOptionPane.showMessageDialog(
                this,
                p.toString(),
                "Cadastro de pessoa",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void openMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem1ActionPerformed
        //menu cadastro uf
        try{
            janelaCadastroUF = JanelaCadastroUF.getInstancia(this);
            if(!desktopPane.isAncestorOf(janelaCadastroUF)){
                desktopPane.add("JanelaCadastroUF", janelaCadastroUF);
                janelaCadastroUF.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                int x = (getDesktopPane().getWidth() - janelaCadastroUF.getWidth()) / 2;
                int y = (getDesktopPane().getHeight() - janelaCadastroUF.getHeight()) / 2;
                janelaCadastroUF.setLocation(x, y);
            }
            
            janelaCadastroUF.setSelected(true);
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, 
                    "Erro ao abrir a tela de cadastro de UF: ",
                    "Cadastro de UF",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openMenuItem1ActionPerformed

    private void menuCadatroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadatroFornecedorActionPerformed
        // TODO add your handling code here:
        try{
            janelaCadastroFornecedor = JanelaCadastroFornecedor.getInstancia(this);
            if(!desktopPane.isAncestorOf(janelaCadastroFornecedor)){
                desktopPane.add("JanelaCadastroFornecedor", janelaCadastroFornecedor);
                janelaCadastroFornecedor.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                int x = (getDesktopPane().getWidth() - janelaCadastroFornecedor.getWidth()) / 2;
                int y = (getDesktopPane().getHeight() - janelaCadastroFornecedor.getHeight()) / 2;
                janelaCadastroFornecedor.setLocation(x, y);
            }
            janelaCadastroFornecedor.setVisible(true);
            janelaCadastroFornecedor.setSelected(true);
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(null, 
                    "Erro ao abrir a tela de cadastro de fornecedores: ",
                    "Cadastro de fornecedores",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuCadatroFornecedorActionPerformed

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCadatroFornecedor;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem openMenuItem1;
    // End of variables declaration//GEN-END:variables

}
