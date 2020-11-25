package Telas;


import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import BeansObjetos.Funcionario;
import Conexoes.Conexao;
import DaoObjetos.DaoFuncionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {
    
    Funcionario ObjetoFuncionario = new Funcionario();
    Conexao conex = new Conexao();
    DaoFuncionario DaoFuncionario = new DaoFuncionario();

    public TelaCadastroFuncionario() {
        initComponents();
        
        pnlSalvar.setVisible(false);
        pnlSair.setVisible(false);
        pnlCancelar.setVisible(false);
        pnlNovoFuncionario.setVisible(false);
        
        //Colocar Os Componentes Aqui Para Não Aparecerem Quando Abrir A Tela{

        pnlCadastro.setVisible(false);
        
        //}
        
        //Setar Imagens Do Tamanho do Botão ou Label{
        
        ImageIcon Menu = new ImageIcon("src/Imagens/IconeMenu.png");
        Menu.setImage(Menu.getImage().getScaledInstance(
                btnMenu.getWidth(),
                btnMenu.getHeight(),
                1));
        btnMenu.setIcon(Menu);
        
        //}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundoMenu = new javax.swing.JPanel();
        pnlNovoFuncionario = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        pnlCancelar = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        pnlSalvar = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        pnlSair = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        pnlCadastro = new javax.swing.JPanel();
        txtSenha = new javax.swing.JFormattedTextField();
        txtLogin = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lbl1Tel = new javax.swing.JLabel();
        lbl2Tel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSexo = new javax.swing.JComboBox<>();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        jSeparatorLogin = new javax.swing.JSeparator();
        jSeparatorCpf = new javax.swing.JSeparator();
        jSeparatorNome = new javax.swing.JSeparator();
        jSeparatorRua = new javax.swing.JSeparator();
        jSeparatorBairro = new javax.swing.JSeparator();
        jSeparatorNumero = new javax.swing.JSeparator();
        jSeparatorCidade = new javax.swing.JSeparator();
        jSeparator1Tel = new javax.swing.JSeparator();
        jSeparator2Tel = new javax.swing.JSeparator();
        jSeparatorEmail = new javax.swing.JSeparator();
        jSeparatorSalario = new javax.swing.JSeparator();
        jSeparatorSenha = new javax.swing.JSeparator();
        txt1Tel = new javax.swing.JFormattedTextField();
        txt2Tel = new javax.swing.JFormattedTextField();
        txtSalario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlFundoMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlFundoMenu.setLayout(null);

        pnlNovoFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        pnlNovoFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlNovoFuncionario.setLayout(null);

        btnNovoCliente.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setText("Novo Funcionário");
        btnNovoCliente.setContentAreaFilled(false);
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        pnlNovoFuncionario.add(btnNovoCliente);
        btnNovoCliente.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlNovoFuncionario);
        pnlNovoFuncionario.setBounds(0, 80, 260, 50);

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

        pnlCadastro.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastro.setForeground(new java.awt.Color(255, 255, 255));
        pnlCadastro.setLayout(null);

        txtSenha.setBorder(null);
        try {
            txtSenha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setOpaque(false);
        pnlCadastro.add(txtSenha);
        txtSenha.setBounds(460, 150, 120, 30);

        txtLogin.setBorder(null);
        try {
            txtLogin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLogin.setOpaque(false);
        pnlCadastro.add(txtLogin);
        txtLogin.setBounds(460, 110, 120, 30);

        lblEstado.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEstado.setText("Estado:");
        pnlCadastro.add(lblEstado);
        lblEstado.setBounds(10, 410, 80, 30);

        lblLogin.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblLogin.setText("Login:");
        pnlCadastro.add(lblLogin);
        lblLogin.setBounds(390, 110, 60, 30);

        lblBairro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblBairro.setText("Bairro:");
        pnlCadastro.add(lblBairro);
        lblBairro.setBounds(20, 140, 66, 20);

        lblRua.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblRua.setText("Rua:");
        pnlCadastro.add(lblRua);
        lblRua.setBounds(40, 100, 44, 20);

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNome.setText("Nome:");
        pnlCadastro.add(lblNome);
        lblNome.setBounds(20, 60, 70, 20);

        lblNumero.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNumero.setText("Nº:");
        pnlCadastro.add(lblNumero);
        lblNumero.setBounds(50, 180, 28, 20);

        lblCidade.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCidade.setText("Cidade:");
        pnlCadastro.add(lblCidade);
        lblCidade.setBounds(10, 220, 80, 20);

        lbl1Tel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl1Tel.setText("¹Tel:");
        pnlCadastro.add(lbl1Tel);
        lbl1Tel.setBounds(40, 260, 50, 20);

        lbl2Tel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl2Tel.setText("²Tel:");
        pnlCadastro.add(lbl2Tel);
        lbl2Tel.setBounds(40, 300, 50, 20);

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEmail.setText("Email:");
        pnlCadastro.add(lblEmail);
        lblEmail.setBounds(20, 340, 70, 20);

        lblSexo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");
        pnlCadastro.add(lblSexo);
        lblSexo.setBounds(30, 380, 60, 20);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlCadastro.add(txtEmail);
        txtEmail.setBounds(90, 330, 270, 30);

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não Informado" }));
        txtSexo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlCadastro.add(txtSexo);
        txtSexo.setBounds(90, 370, 170, 30);

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCidade.setBorder(null);
        txtCidade.setOpaque(false);
        pnlCadastro.add(txtCidade);
        txtCidade.setBounds(90, 210, 270, 30);

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNumero.setBorder(null);
        txtNumero.setOpaque(false);
        pnlCadastro.add(txtNumero);
        txtNumero.setBounds(90, 170, 270, 30);

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBairro.setBorder(null);
        txtBairro.setOpaque(false);
        pnlCadastro.add(txtBairro);
        txtBairro.setBounds(90, 130, 270, 30);

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRua.setBorder(null);
        pnlCadastro.add(txtRua);
        txtRua.setBounds(90, 90, 270, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.setBorder(null);
        txtNome.setOpaque(false);
        pnlCadastro.add(txtNome);
        txtNome.setBounds(90, 50, 270, 30);

        txtCpf.setBorder(null);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCpf.setOpaque(false);
        pnlCadastro.add(txtCpf);
        txtCpf.setBounds(90, 10, 270, 30);

        lblCPF.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCPF.setText("CPF:");
        pnlCadastro.add(lblCPF);
        lblCPF.setBounds(40, 20, 50, 20);

        lblSenha.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");
        pnlCadastro.add(lblSenha);
        lblSenha.setBounds(380, 150, 67, 30);

        lblSalario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblSalario.setText("Salário:");
        pnlCadastro.add(lblSalario);
        lblSalario.setBounds(370, 190, 80, 30);

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        txtEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCadastro.add(txtEstado);
        txtEstado.setBounds(90, 410, 120, 30);

        jSeparatorLogin.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorLogin);
        jSeparatorLogin.setBounds(460, 140, 120, 10);

        jSeparatorCpf.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorCpf);
        jSeparatorCpf.setBounds(90, 40, 270, 10);

        jSeparatorNome.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorNome);
        jSeparatorNome.setBounds(90, 80, 270, 10);

        jSeparatorRua.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorRua);
        jSeparatorRua.setBounds(90, 120, 270, 10);

        jSeparatorBairro.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorBairro);
        jSeparatorBairro.setBounds(90, 160, 270, 10);

        jSeparatorNumero.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorNumero);
        jSeparatorNumero.setBounds(90, 200, 270, 10);

        jSeparatorCidade.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorCidade);
        jSeparatorCidade.setBounds(90, 240, 270, 10);

        jSeparator1Tel.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparator1Tel);
        jSeparator1Tel.setBounds(90, 280, 270, 10);

        jSeparator2Tel.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparator2Tel);
        jSeparator2Tel.setBounds(90, 320, 270, 10);

        jSeparatorEmail.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorEmail);
        jSeparatorEmail.setBounds(90, 360, 270, 10);

        jSeparatorSalario.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorSalario);
        jSeparatorSalario.setBounds(460, 220, 120, 10);

        jSeparatorSenha.setForeground(new java.awt.Color(0, 0, 0));
        pnlCadastro.add(jSeparatorSenha);
        jSeparatorSenha.setBounds(460, 180, 120, 10);

        txt1Tel.setBorder(null);
        try {
            txt1Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt1Tel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pnlCadastro.add(txt1Tel);
        txt1Tel.setBounds(90, 250, 270, 30);

        txt2Tel.setBorder(null);
        try {
            txt2Tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt2Tel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pnlCadastro.add(txt2Tel);
        txt2Tel.setBounds(90, 290, 270, 30);

        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalario.setBorder(null);
        pnlCadastro.add(txtSalario);
        txtSalario.setBounds(460, 190, 120, 30);

        getContentPane().add(pnlCadastro);
        pnlCadastro.setBounds(260, 0, 590, 510);

        setSize(new java.awt.Dimension(851, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        //Mostrar Componentes{
        
        //}Mostrar componentes;
        
         pnlCadastro.setVisible(true);
         
        //Limpar Campos{
        txtCpf.setText("");
        txtNome.setText("");
        txtRua.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txt1Tel.setText("");
        txt2Tel.setText("");
        txtEmail.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtSalario.setText("");
        txtSexo.setSelectedIndex(0);
        txtEstado.setSelectedIndex(0);
        //}Limpar Campos;
        
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        ObjetoFuncionario.setCpf(txtCpf.getText());
        ObjetoFuncionario.setNome(txtNome.getText());
        ObjetoFuncionario.setRua(txtRua.getText());
        ObjetoFuncionario.setBairro(txtBairro.getText());
        ObjetoFuncionario.setNumero(txtNumero.getText());
        ObjetoFuncionario.setCidade(txtCidade.getText());
        ObjetoFuncionario.setTel1(txt1Tel.getText());
        ObjetoFuncionario.setTel2(txt2Tel.getText());
        ObjetoFuncionario.setEmail(txtEmail.getText());
        ObjetoFuncionario.setSexo((String) txtSexo.getSelectedItem());
        ObjetoFuncionario.setEstado((String) txtEstado.getSelectedItem());
        ObjetoFuncionario.setLogin(txtLogin.getText());
        ObjetoFuncionario.setSenha(txtSenha.getText());
        ObjetoFuncionario.setSalario(txtSalario.getText());
        
        DaoFuncionario.SalvarFuncionario(ObjetoFuncionario);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Limpar Campos{
        txtCpf.setText("");
        txtNome.setText("");
        txtRua.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtCidade.setText("");
        txt1Tel.setText("");
        txt2Tel.setText("");
        txtEmail.setText("");
        txtLogin.setText("");
        txtSenha.setText("");
        txtSalario.setText("");
        txtSexo.setSelectedIndex(0);
        txtEstado.setSelectedIndex(0);
        //}Limpar Campos;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
         pnlNovoFuncionario.setVisible(true);
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
                        pnlNovoFuncionario.setLocation(xNovoFuncionario,yNovoFuncionario);
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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JSeparator jSeparator1Tel;
    private javax.swing.JSeparator jSeparator2Tel;
    private javax.swing.JSeparator jSeparatorBairro;
    private javax.swing.JSeparator jSeparatorCidade;
    private javax.swing.JSeparator jSeparatorCpf;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorLogin;
    private javax.swing.JSeparator jSeparatorNome;
    private javax.swing.JSeparator jSeparatorNumero;
    private javax.swing.JSeparator jSeparatorRua;
    private javax.swing.JSeparator jSeparatorSalario;
    private javax.swing.JSeparator jSeparatorSenha;
    private javax.swing.JLabel lbl1Tel;
    private javax.swing.JLabel lbl2Tel;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlCancelar;
    private javax.swing.JPanel pnlFundoMenu;
    private javax.swing.JPanel pnlNovoFuncionario;
    private javax.swing.JPanel pnlSair;
    private javax.swing.JPanel pnlSalvar;
    private javax.swing.JFormattedTextField txt1Tel;
    private javax.swing.JFormattedTextField txt2Tel;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JFormattedTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JFormattedTextField txtSenha;
    private javax.swing.JComboBox<String> txtSexo;
    // End of variables declaration//GEN-END:variables
}
