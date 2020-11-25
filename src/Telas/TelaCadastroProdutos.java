/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Conexoes.Conexao;
import DaoObjetos.DaoProdutos;
import BeansObjetos.BeansProduto;
import static java.lang.Thread.sleep;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;

public class TelaCadastroProdutos extends javax.swing.JFrame {

    BeansProduto ObjetoProduto = new BeansProduto();
    Conexao conex = new Conexao();
    DaoProdutos DaoProduto = new DaoProdutos();
    
    public TelaCadastroProdutos() {
        initComponents();
        pnlNovoProduto.setVisible(false);
        pnlCancelar.setVisible(false);
        pnlSalvar.setVisible(false);
        pnlSair.setVisible(false);
        
        ImageIcon Menu = new ImageIcon("src/imagens/IconeMenu.png");
        Menu.setImage(Menu.getImage().getScaledInstance(
                btnMenu.getWidth(), 
                btnMenu.getHeight(), 
                1));
        btnMenu.setIcon(Menu);
        btnMenu.setContentAreaFilled(false);
        
        pnlCadastro.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastro = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lbl1Tel = new javax.swing.JLabel();
        lbl2Tel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        jSeparatorCpf = new javax.swing.JSeparator();
        jSeparatorNome = new javax.swing.JSeparator();
        jSeparator1Tel = new javax.swing.JSeparator();
        jSeparator2Tel = new javax.swing.JSeparator();
        jSeparatorEmail = new javax.swing.JSeparator();
        txt1Tel = new javax.swing.JFormattedTextField();
        txt2Tel = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        jSeparatorEmail1 = new javax.swing.JSeparator();
        lbMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparatorEmail2 = new javax.swing.JSeparator();
        pnlFundoMenu = new javax.swing.JPanel();
        pnlNovoProduto = new javax.swing.JPanel();
        btnNovoProduto = new javax.swing.JButton();
        pnlCancelar = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        pnlSalvar = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        pnlSair = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlCadastro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastro.setForeground(new java.awt.Color(255, 255, 255));
        pnlCadastro.setLayout(null);

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNome.setText("Nome:");
        pnlCadastro.add(lblNome);
        lblNome.setBounds(80, 60, 70, 20);

        lbl1Tel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl1Tel.setText("¹Tel:");
        pnlCadastro.add(lbl1Tel);
        lbl1Tel.setBounds(100, 100, 50, 20);

        lbl2Tel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl2Tel.setText("²Tel:");
        pnlCadastro.add(lbl2Tel);
        lbl2Tel.setBounds(100, 140, 50, 20);

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEmail.setText("Email:");
        pnlCadastro.add(lblEmail);
        lblEmail.setBounds(80, 180, 70, 20);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlCadastro.add(txtEmail);
        txtEmail.setBounds(150, 170, 270, 30);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        pnlCadastro.add(txtCodigo);
        txtCodigo.setBounds(150, 10, 270, 30);

        lblCPF.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCPF.setText("Código:");
        pnlCadastro.add(lblCPF);
        lblCPF.setBounds(70, 20, 80, 20);

        jSeparatorCpf.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorCpf);
        jSeparatorCpf.setBounds(150, 40, 270, 10);

        jSeparatorNome.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorNome);
        jSeparatorNome.setBounds(150, 80, 270, 10);

        jSeparator1Tel.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparator1Tel);
        jSeparator1Tel.setBounds(150, 120, 270, 10);

        jSeparator2Tel.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparator2Tel);
        jSeparator2Tel.setBounds(150, 160, 270, 10);

        jSeparatorEmail.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorEmail);
        jSeparatorEmail.setBounds(150, 200, 270, 10);

        txt1Tel.setBorder(null);
        try {
            txt1Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt1Tel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pnlCadastro.add(txt1Tel);
        txt1Tel.setBounds(150, 90, 270, 30);

        txt2Tel.setBorder(null);
        try {
            txt2Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt2Tel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pnlCadastro.add(txt2Tel);
        txt2Tel.setBounds(150, 130, 270, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.setBorder(null);
        txtNome.setOpaque(false);
        pnlCadastro.add(txtNome);
        txtNome.setBounds(150, 50, 270, 30);

        lblFornecedor.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFornecedor.setText("Fornecedor:");
        pnlCadastro.add(lblFornecedor);
        lblFornecedor.setBounds(30, 220, 130, 20);

        txtFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFornecedor.setBorder(null);
        txtFornecedor.setOpaque(false);
        txtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorActionPerformed(evt);
            }
        });
        pnlCadastro.add(txtFornecedor);
        txtFornecedor.setBounds(150, 210, 270, 30);

        jSeparatorEmail1.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorEmail1);
        jSeparatorEmail1.setBounds(150, 240, 270, 10);

        lbMarca.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbMarca.setText("Marca:");
        pnlCadastro.add(lbMarca);
        lbMarca.setBounds(80, 260, 70, 20);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMarca.setBorder(null);
        txtMarca.setOpaque(false);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        pnlCadastro.add(txtMarca);
        txtMarca.setBounds(150, 250, 270, 30);

        jSeparatorEmail2.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorEmail2);
        jSeparatorEmail2.setBounds(150, 280, 270, 10);

        getContentPane().add(pnlCadastro);
        pnlCadastro.setBounds(260, 0, 590, 510);

        pnlFundoMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlFundoMenu.setLayout(null);

        pnlNovoProduto.setBackground(new java.awt.Color(102, 102, 102));
        pnlNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlNovoProduto.setLayout(null);

        btnNovoProduto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovoProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto.setText("Novo Produto");
        btnNovoProduto.setContentAreaFilled(false);
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });
        pnlNovoProduto.add(btnNovoProduto);
        btnNovoProduto.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlNovoProduto);
        pnlNovoProduto.setBounds(0, 80, 260, 50);

        pnlCancelar.setBackground(new java.awt.Color(153, 153, 153));
        pnlCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlCancelar.setLayout(null);

        btnCancelar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlCancelar.add(btnCancelar);
        btnCancelar.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlCancelar);
        pnlCancelar.setBounds(0, 130, 260, 50);

        pnlSalvar.setBackground(new java.awt.Color(204, 204, 204));
        pnlSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlSalvar.setLayout(null);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlSalvar.add(btnSalvar);
        btnSalvar.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlSalvar);
        pnlSalvar.setBounds(0, 180, 260, 50);

        pnlSair.setBackground(new java.awt.Color(204, 204, 204));
        pnlSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlSair.setLayout(null);

        btnSair.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlSair.add(btnSair);
        btnSair.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlSair);
        pnlSair.setBounds(0, 230, 260, 50);

        btnMenu.setContentAreaFilled(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlFundoMenu.add(btnMenu);
        btnMenu.setBounds(20, 20, 30, 30);

        getContentPane().add(pnlFundoMenu);
        pnlFundoMenu.setBounds(0, 0, 260, 510);

        setSize(new java.awt.Dimension(851, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        //Mostrar Componentes{

            //}Mostrar componentes;

        pnlCadastro.setVisible(true);

        //Limpar Campos{
            txtCodigo.setText("");
            txtNome.setText("");
            txtFornecedor.setText("");
            txt1Tel.setText("");
            txt2Tel.setText("");
            txtEmail.setText("");
            txtMarca.setText("");
            
            //}Limpar Campos;

    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Limpar Campos{
            txtCodigo.setText("");
            txtNome.setText("");
            txtFornecedor.setText("");
            txt1Tel.setText("");
            txt2Tel.setText("");
            txtEmail.setText("");
            txtMarca.setText("");

            //}Limpar Campos;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        ObjetoProduto.setNome(txtNome.getText());
        ObjetoProduto.setTel1(txt1Tel.getText());
        ObjetoProduto.setTel2(txt2Tel.getText());
        ObjetoProduto.setEmail(txtEmail.getText());
        ObjetoProduto.setFornecedor(txtFornecedor.getText());
        ObjetoProduto.setMarca(txtMarca.getText());
        
        DaoProduto.SalvarProdutos(ObjetoProduto);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        pnlNovoProduto.setVisible(true);
        pnlCancelar.setVisible(true);
        pnlSalvar.setVisible(true);
        pnlSair.setVisible(true);

        try {
            sleep(5);
        } catch (InterruptedException ex) {
        }
        new Thread(){

            @Override
            public void run(){

                int xNovoFuncionario = pnlCancelar.getLocation().x;
                int yNovoFuncionario = 80;

                int xCancelar = pnlCancelar.getLocation().x;
                int yCancelar = 80;

                int xSair = pnlSair.getLocation().x;
                int ySair = 80;

                while(true){
                    yCancelar++;
                    yCancelar++;
                    ySair++;

                    if(yNovoFuncionario >= 130){
                        yNovoFuncionario = 130;

                    }
                    if(yCancelar >= 180){
                        yCancelar = 180;
                    }
                    if(ySair >= 230){
                        ySair = 230;
                    }
                    pnlNovoProduto.setLocation(xNovoFuncionario,yNovoFuncionario);
                    pnlSalvar.setLocation(xCancelar,yCancelar);
                    pnlSair.setLocation(xSair, ySair);

                    try {
                        sleep(5);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        }.start();

    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JSeparator jSeparator1Tel;
    private javax.swing.JSeparator jSeparator2Tel;
    private javax.swing.JSeparator jSeparatorCpf;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorEmail1;
    private javax.swing.JSeparator jSeparatorEmail2;
    private javax.swing.JSeparator jSeparatorNome;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbl1Tel;
    private javax.swing.JLabel lbl2Tel;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlCancelar;
    private javax.swing.JPanel pnlFundoMenu;
    private javax.swing.JPanel pnlNovoProduto;
    private javax.swing.JPanel pnlSair;
    private javax.swing.JPanel pnlSalvar;
    private javax.swing.JFormattedTextField txt1Tel;
    private javax.swing.JFormattedTextField txt2Tel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
