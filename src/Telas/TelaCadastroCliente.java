package Telas;


import Objetos.Cliente;
import static java.lang.Thread.sleep;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadastroCliente extends javax.swing.JFrame {
    
    Cliente novoCliente = new Cliente();
    
    
    public TelaCadastroCliente() {
        initComponents();
        pnlFundoCadastro.setVisible(false);//Esconde o Painel De Cadastro   
        
        pnlNovoCliente.setVisible(false);
        pnlSalvar.setVisible(false);
        pnlCancelar.setVisible(false);
        pnlSair.setVisible(false);
        
        
        //Insetar Imagens nos Componentes{
        ImageIcon Menu = new ImageIcon("src/Imagens/IconeMenu.png");
        Menu.setImage(Menu.getImage().getScaledInstance(
                btnMenu.getWidth(),
                btnMenu.getHeight(), 
                1));
        btnMenu.setIcon(Menu);
        
        //}Fim Da Inseção de Imagens nos Componentes;
        
    }
    
     private void cadastraCliente(Cliente novoCliente){
 
        
        novoCliente.setEndereço(txtEndereço.getText());
        novoCliente.setCidade(txtCidade.getText());
        novoCliente.setNome(txCidade.getText());
        novoCliente.setCpf(txtCpf.getText());
        novoCliente.setTel1(txt1Tel.getText());
        novoCliente.setTel2(txt2Tel.getText());
        novoCliente.setNumero(txtNumero.getText());
        novoCliente.setEmail(txtEmail.getText());
        novoCliente.setSexo((String)txtSexo.getSelectedItem());
               
        }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundoCadastro = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<>();
        lbl2Tel = new javax.swing.JLabel();
        txt2Tel = new javax.swing.JFormattedTextField();
        txt1Tel = new javax.swing.JFormattedTextField();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lbl1Tel = new javax.swing.JLabel();
        jSeparatorCpf = new javax.swing.JSeparator();
        jSeparatorNome = new javax.swing.JSeparator();
        jSeparatorNumero = new javax.swing.JSeparator();
        jSeparatorCidade = new javax.swing.JSeparator();
        jSeparator1Tel = new javax.swing.JSeparator();
        jSeparator2Tel = new javax.swing.JSeparator();
        jSeparatorEmail = new javax.swing.JSeparator();
        lblEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereço = new javax.swing.JTextField();
        pnlFundoMenu = new javax.swing.JPanel();
        pnlNovoCliente = new javax.swing.JPanel();
        btnNovoCliente1 = new javax.swing.JButton();
        pnlCancelar = new javax.swing.JPanel();
        btnCancelar1 = new javax.swing.JButton();
        pnlSalvar = new javax.swing.JPanel();
        btnSalvar1 = new javax.swing.JButton();
        pnlSair = new javax.swing.JPanel();
        btnSair1 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlFundoCadastro.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundoCadastro.setLayout(null);

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEmail.setText("Email:");
        pnlFundoCadastro.add(lblEmail);
        lblEmail.setBounds(40, 290, 70, 20);

        lblSexo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");
        pnlFundoCadastro.add(lblSexo);
        lblSexo.setBounds(40, 330, 60, 20);

        txtSexo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não Informado" }));
        txtSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlFundoCadastro.add(txtSexo);
        txtSexo.setBounds(110, 320, 170, 30);

        lbl2Tel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl2Tel.setText("²Tel:");
        pnlFundoCadastro.add(lbl2Tel);
        lbl2Tel.setBounds(60, 250, 50, 20);

        txt2Tel.setBorder(null);
        try {
            txt2Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt2Tel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pnlFundoCadastro.add(txt2Tel);
        txt2Tel.setBounds(110, 240, 270, 30);

        txt1Tel.setBorder(null);
        try {
            txt1Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt1Tel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pnlFundoCadastro.add(txt1Tel);
        txt1Tel.setBounds(110, 200, 270, 30);

        txtCidade.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtCidade.setBorder(null);
        pnlFundoCadastro.add(txtCidade);
        txtCidade.setBounds(110, 240, 270, 30);

        txtNumero.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtNumero.setBorder(null);
        pnlFundoCadastro.add(txtNumero);
        txtNumero.setBounds(110, 200, 270, 30);

        txtCpf.setBorder(null);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setDragEnabled(true);
        txtCpf.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtCpf.setOpaque(false);
        pnlFundoCadastro.add(txtCpf);
        txtCpf.setBounds(110, 40, 120, 30);

        lblCPF.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCPF.setText("CPF:");
        pnlFundoCadastro.add(lblCPF);
        lblCPF.setBounds(60, 50, 50, 20);

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNome.setText("Nome:");
        pnlFundoCadastro.add(lblNome);
        lblNome.setBounds(40, 90, 70, 20);

        lblRua.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblRua.setText("Endereço: ");
        pnlFundoCadastro.add(lblRua);
        lblRua.setBounds(10, 130, 110, 20);

        lblCidade.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCidade.setText("Cidade:");
        pnlFundoCadastro.add(lblCidade);
        lblCidade.setBounds(30, 170, 80, 20);

        lbl1Tel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl1Tel.setText("¹Tel:");
        pnlFundoCadastro.add(lbl1Tel);
        lbl1Tel.setBounds(60, 210, 50, 20);

        jSeparatorCpf.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparatorCpf);
        jSeparatorCpf.setBounds(110, 70, 120, 10);

        jSeparatorNome.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparatorNome);
        jSeparatorNome.setBounds(110, 110, 270, 10);

        jSeparatorNumero.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparatorNumero);
        jSeparatorNumero.setBounds(110, 150, 270, 10);

        jSeparatorCidade.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparatorCidade);
        jSeparatorCidade.setBounds(110, 190, 270, 10);

        jSeparator1Tel.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparator1Tel);
        jSeparator1Tel.setBounds(110, 230, 270, 10);

        jSeparator2Tel.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparator2Tel);
        jSeparator2Tel.setBounds(110, 270, 270, 10);

        jSeparatorEmail.setForeground(new java.awt.Color(0, 0, 0));
        pnlFundoCadastro.add(jSeparatorEmail);
        jSeparatorEmail.setBounds(110, 310, 270, 10);

        lblEstado.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEstado.setText("Estado:");
        pnlFundoCadastro.add(lblEstado);
        lblEstado.setBounds(30, 360, 80, 30);

        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBoxEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlFundoCadastro.add(jComboBoxEstado);
        jComboBoxEstado.setBounds(110, 360, 120, 30);

        txtEmail.setBorder(null);
        pnlFundoCadastro.add(txtEmail);
        txtEmail.setBounds(110, 280, 270, 30);

        txCidade.setBorder(null);
        pnlFundoCadastro.add(txCidade);
        txCidade.setBounds(110, 160, 270, 30);

        txtNome.setBorder(null);
        pnlFundoCadastro.add(txtNome);
        txtNome.setBounds(110, 80, 270, 30);

        txtEndereço.setBorder(null);
        pnlFundoCadastro.add(txtEndereço);
        txtEndereço.setBounds(110, 120, 270, 30);

        getContentPane().add(pnlFundoCadastro);
        pnlFundoCadastro.setBounds(260, 0, 410, 510);

        pnlFundoMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlFundoMenu.setLayout(null);

        pnlNovoCliente.setBackground(new java.awt.Color(102, 102, 102));
        pnlNovoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlNovoCliente.setLayout(null);

        btnNovoCliente1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovoCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente1.setText("Novo Cliente");
        btnNovoCliente1.setContentAreaFilled(false);
        btnNovoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCliente1ActionPerformed(evt);
            }
        });
        pnlNovoCliente.add(btnNovoCliente1);
        btnNovoCliente1.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlNovoCliente);
        pnlNovoCliente.setBounds(0, 80, 260, 50);

        pnlCancelar.setBackground(new java.awt.Color(153, 153, 153));
        pnlCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlCancelar.setLayout(null);

        btnCancelar1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setContentAreaFilled(false);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        pnlCancelar.add(btnCancelar1);
        btnCancelar1.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlCancelar);
        pnlCancelar.setBounds(0, 130, 260, 50);

        pnlSalvar.setBackground(new java.awt.Color(204, 204, 204));
        pnlSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlSalvar.setLayout(null);

        btnSalvar1.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSalvar1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar1.setText("Salvar");
        btnSalvar1.setContentAreaFilled(false);
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        pnlSalvar.add(btnSalvar1);
        btnSalvar1.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlSalvar);
        pnlSalvar.setBounds(0, 180, 260, 50);

        pnlSair.setBackground(new java.awt.Color(204, 204, 204));
        pnlSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlSair.setLayout(null);

        btnSair1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSair1.setForeground(new java.awt.Color(255, 255, 255));
        btnSair1.setText("Sair");
        btnSair1.setContentAreaFilled(false);
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });
        pnlSair.add(btnSair1);
        btnSair1.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlSair);
        pnlSair.setBounds(0, 230, 260, 50);

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setToolTipText("Abrir Ferramentas");
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlFundoMenu.add(btnMenu);
        btnMenu.setBounds(30, 20, 30, 30);

        getContentPane().add(pnlFundoMenu);
        pnlFundoMenu.setBounds(0, 0, 260, 510);

        setSize(new java.awt.Dimension(668, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCliente1ActionPerformed
        
    pnlFundoCadastro.setVisible(true); //Chama o Painel de Cadastro
    
     //Limpar Componentes{
        
     txtCpf.setText("");
     txCidade.setText("");
     txtEndereço.setText("");
     txtNumero.setText("");
     txtCidade.setText("");
     txt2Tel.setText("");
     txt1Tel.setText("");
     txtEmail.setText("");
     txtSexo.setSelectedIndex(0);
     jComboBoxEstado.setSelectedIndex(0);
     
     
     //}
        
    }//GEN-LAST:event_btnNovoCliente1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // Limpar Componentes{
     txtNome.setText("");
     txtCpf.setText("");
     txCidade.setText("");
     txtEndereço.setText("");
     txtNumero.setText("");
     txtCidade.setText("");
     txt2Tel.setText("");
     txt1Tel.setText("");
     txtEmail.setText("");
     txtSexo.setSelectedIndex(0);
     jComboBoxEstado.setSelectedIndex(0);
     //}
     
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        pnlNovoCliente.setVisible(true);
        pnlSalvar.setVisible(true);
        pnlCancelar.setVisible(true);
        pnlSair.setVisible(true);

        try {
            sleep(5);
        } catch (InterruptedException ex) {
        }
        new Thread(){

            @Override
            public void run(){

                int xCancelar = pnlCancelar.getLocation().x;
                int yCancelar = 80;

                int xSalvar = pnlSalvar.getLocation().x;
                int ySalvar = 80;

                int xSair = pnlSair.getLocation().x;
                int ySair = 80;

                while(true){
                    yCancelar++;
                    ySalvar++;
                    ySair++;

                    if(yCancelar >= 130){
                        yCancelar = 130;

                    }
                    if(ySalvar >= 180){
                        ySalvar = 180;
                    }
                    if(ySair >= 230){
                        ySair = 230;
                    }
                    pnlSair.setLocation(xSair,ySair);
                    pnlCancelar.setLocation(xCancelar,yCancelar);
                    pnlSalvar.setLocation(xSalvar, ySalvar);

                    try {
                        sleep(5);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        }.start();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSair1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovoCliente1;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JSeparator jSeparator1Tel;
    private javax.swing.JSeparator jSeparator2Tel;
    private javax.swing.JSeparator jSeparatorCidade;
    private javax.swing.JSeparator jSeparatorCpf;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorNome;
    private javax.swing.JSeparator jSeparatorNumero;
    private javax.swing.JLabel lbl1Tel;
    private javax.swing.JLabel lbl2Tel;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JPanel pnlCancelar;
    private javax.swing.JPanel pnlFundoCadastro;
    private javax.swing.JPanel pnlFundoMenu;
    private javax.swing.JPanel pnlNovoCliente;
    private javax.swing.JPanel pnlSair;
    private javax.swing.JPanel pnlSalvar;
    private javax.swing.JTextField txCidade;
    private javax.swing.JFormattedTextField txt1Tel;
    private javax.swing.JFormattedTextField txt2Tel;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JComboBox<String> txtSexo;
    // End of variables declaration//GEN-END:variables
}
