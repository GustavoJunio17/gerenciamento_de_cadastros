/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfacegrafica3.view;

import interfacegrafica3.model.Pessoa;
import interfacegrafica3.repository.PessoaRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class JanelaCadastro extends javax.swing.JInternalFrame {

    private static JanelaCadastro instancia;
    private JanelaPrincipal janelaPrincipal;
    /**
     * Creates new form JanelaCadastro
     */
    public JanelaCadastro(JanelaPrincipal janelaPrincipal) {
        initComponents();
        this.janelaPrincipal = janelaPrincipal;
        txtId.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        bntGravar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        bntDeletar = new javax.swing.JButton();

        setTitle("Tela de cadastro");
        setVisible(true);

        bntFechar.setText("Fechar");
        bntFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFecharActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereco:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Telefone:");

        bntGravar.setText("Gravar");
        bntGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGravarActionPerformed(evt);
            }
        });

        btnAvancar.setText("⏩");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnRetroceder.setText("⏪");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        bntDeletar.setText("Excluir");
        bntDeletar.setToolTipText("");
        bntDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRetroceder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvancar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bntGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnAvancar)
                    .addComponent(btnRetroceder))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntFechar)
                    .addComponent(bntGravar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFecharActionPerformed
        // TODO add your handling code here:
        fecharJanela();
    }//GEN-LAST:event_bntFecharActionPerformed

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        
        int id = Integer.parseInt(txtId.getText());
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(txtNome.getText());
        pessoa.setEndereco(txtEndereco.getText());
        pessoa.setEmail(txtEmail.getText());
        pessoa.setTelefone(txtTelefone.getText());
        pessoa.setId(id);
        //inserir pessoa no banco de dados
        PessoaRepository pessoaRepository = new PessoaRepository();
        boolean retornoBanco = false;
        if(Integer.parseInt(txtId.getText()) == 0){
            //inserir
            retornoBanco = pessoaRepository.inserir(
                janelaPrincipal.conexaoMySQL.connection, 
                pessoa);
        }else{
            //atualizar
            retornoBanco = pessoaRepository.atualizar(
                janelaPrincipal.conexaoMySQL.connection, 
                pessoa);
        }       
        if(retornoBanco){
            JOptionPane.showMessageDialog(
                    this,
                    "Cadastro atualizado com sucesso!",
                    "Tela de cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
            limparJanela();
        }
        
    }//GEN-LAST:event_bntGravarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
        limparJanela();
        PessoaRepository pessoaRepository = new PessoaRepository();
        Pessoa pessoa = pessoaRepository.selecionar(
                janelaPrincipal.conexaoMySQL.connection, 
                ">", 
                Integer.parseInt(txtId.getText()));
        if(pessoa != null){
            //jogar os dados da pessoa na tela:
            txtNome.setText(pessoa.getNome());
            txtEmail.setText(pessoa.getEmail());
            txtEndereco.setText(pessoa.getEndereco());
            txtTelefone.setText(pessoa.getTelefone());
            txtId.setText(String.valueOf(pessoa.getId()));
        }else{
            limparJanela();
            txtId.setText("0");
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        
        limparJanela();
        PessoaRepository pessoaRepository = new PessoaRepository();
        Pessoa pessoa = pessoaRepository.selecionar(
                janelaPrincipal.conexaoMySQL.connection, 
                "<", 
                Integer.parseInt(txtId.getText()));
        if(pessoa != null){
            //jogar os dados da pessoa na tela:
            txtNome.setText(pessoa.getNome());
            txtEmail.setText(pessoa.getEmail());
            txtEndereco.setText(pessoa.getEndereco());
            txtTelefone.setText(pessoa.getTelefone());
            txtId.setText(String.valueOf(pessoa.getId()));
        }else{
            limparJanela();
            txtId.setText("0");
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void bntDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletarActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(txtId.getText()) > 0){
            int resposta = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente excluir esse registro?",
                    "Excluir?",
                    JOptionPane.YES_NO_OPTION
            );
            if(resposta == JOptionPane.YES_OPTION){
                //excluir registro:
                int id = Integer.parseInt(txtId.getText());
                Pessoa pessoa = new Pessoa();
                pessoa.setId(id);
                PessoaRepository pessoaRepository = new PessoaRepository();
                boolean retornoBanco = pessoaRepository.deletar(
                        janelaPrincipal.conexaoMySQL.connection,
                        pessoa
                );
                if(retornoBanco){
                    limparJanela();
                    txtId.setText("0");
                    //atualizaIdLista();
                    JOptionPane.showMessageDialog(
                            this,
                            "Registro excluído com sucesso!",
                            "Tela de cadastro",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }                
                
            }            
        }
    }//GEN-LAST:event_bntDeletarActionPerformed
    
    private void limparJanela(){
        txtNome.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtNome.requestFocus();
    }
    
    private void fecharJanela(){
        instancia = null;
        dispose();
    }
    
    public static JanelaCadastro getInstancia(JanelaPrincipal janelaPrincipal){
        if(instancia == null)
            instancia = new JanelaCadastro(janelaPrincipal);
        return instancia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDeletar;
    private javax.swing.JButton bntFechar;
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
