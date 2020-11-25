package Telas;


import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Otavio
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        pnlNovoCliente.setVisible(false);
        pnlFuncionario.setVisible(false);
        pnlNovoProduto.setVisible(false);
        pnlSair.setVisible(false);
        
        //Setar Imagens nos componentes{
        
        ImageIcon Produto = new ImageIcon("src/imagens/IconeProduto.png");
        Produto.setImage(Produto.getImage().getScaledInstance(
                 btnTabelaProduto.getWidth(),
                 btnTabelaProduto.getHeight(),
                 1));
        
        btnTabelaProduto.setIcon(Produto);
   
        ImageIcon Logo = new ImageIcon("src/imagens/LogoLoja.png");
        Logo.setImage(Logo.getImage().getScaledInstance(
                lblLogo.getWidth(), 
                lblLogo.getHeight(),
                1));
        lblLogo.setIcon(Logo);
        lblLogo.setBorder(null);
        
        
        ImageIcon Menu = new ImageIcon("src/imagens/IconeMenu.png");
        Menu.setImage(Menu.getImage().getScaledInstance(
                btnMenu.getWidth(), 
                btnMenu.getHeight(), 
                1));
        btnMenu.setIcon(Menu);
        btnMenu.setContentAreaFilled(false);
        
       
        ImageIcon Minimizar = new ImageIcon("src/imagens/IconeMinimizar.png");
        Minimizar.setImage(Minimizar.getImage().getScaledInstance(
                btnMinimizar.getWidth(), 
                btnMinimizar.getHeight(), 
                1));
        btnMinimizar.setIcon(Minimizar);
        btnMinimizar.setContentAreaFilled(false);
        
        
        ImageIcon Fechar = new ImageIcon("src/imagens/IconeFechar.png");
        Fechar.setImage(Fechar.getImage().getScaledInstance(
                btnFechar.getWidth(),
                btnFechar.getHeight(),
                1));
        btnFechar.setIcon(Fechar);
        btnFechar.setContentAreaFilled(false); 
        

        
        ImageIcon TabelaCliente = new ImageIcon("src/imagens/IconeTabelas.png");
        TabelaCliente.setImage(TabelaCliente.getImage().getScaledInstance(
                btnTabelaClientes.getWidth(),
                btnTabelaClientes.getHeight(),
                6));
        btnTabelaClientes.setIcon(TabelaCliente);
        
        ImageIcon TabelaFuncionario = new ImageIcon("src/Imagens/IconeFuncionarios.png");
        TabelaFuncionario.setImage(TabelaFuncionario.getImage().getScaledInstance(
                btnTabelaFuncionario.getWidth(),
                btnTabelaFuncionario.getHeight(),
                6));
        btnTabelaFuncionario.setIcon(TabelaFuncionario);
        //}
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundoBranco = new javax.swing.JPanel();
        pnlTabelaCliente = new javax.swing.JPanel();
        btnTabelaClientes = new javax.swing.JButton();
        pnlTabelaFuncionario = new javax.swing.JPanel();
        btnTabelaFuncionario = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        pnlTabelaProduto = new javax.swing.JPanel();
        btnTabelaProduto = new javax.swing.JButton();
        pnlFundoMenu = new javax.swing.JPanel();
        pnlNovoCliente = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        pnlFuncionario = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        pnlNovoProduto = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        pnlSair = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlFundoBranco.setBackground(new java.awt.Color(255, 255, 255));
        pnlFundoBranco.setLayout(null);

        pnlTabelaCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabelaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlTabelaCliente.setLayout(null);

        btnTabelaClientes.setToolTipText("Tabela Clientes");
        btnTabelaClientes.setBorder(null);
        btnTabelaClientes.setContentAreaFilled(false);
        btnTabelaClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnTabelaClientesMouseMoved(evt);
            }
        });
        btnTabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTabelaClientesMouseExited(evt);
            }
        });
        btnTabelaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaClientesActionPerformed(evt);
            }
        });
        pnlTabelaCliente.add(btnTabelaClientes);
        btnTabelaClientes.setBounds(10, 10, 80, 80);

        pnlFundoBranco.add(pnlTabelaCliente);
        pnlTabelaCliente.setBounds(70, 70, 100, 100);

        pnlTabelaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabelaFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlTabelaFuncionario.setLayout(null);

        btnTabelaFuncionario.setToolTipText("Tabela Funcionarios");
        btnTabelaFuncionario.setBorder(null);
        btnTabelaFuncionario.setContentAreaFilled(false);
        btnTabelaFuncionario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnTabelaFuncionarioMouseMoved(evt);
            }
        });
        btnTabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTabelaFuncionarioMouseExited(evt);
            }
        });
        pnlTabelaFuncionario.add(btnTabelaFuncionario);
        btnTabelaFuncionario.setBounds(10, 10, 80, 80);

        pnlFundoBranco.add(pnlTabelaFuncionario);
        pnlTabelaFuncionario.setBounds(180, 70, 100, 100);

        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlFundoBranco.add(lblLogo);
        lblLogo.setBounds(360, 300, 100, 90);

        pnlTabelaProduto.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabelaProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlTabelaProduto.setLayout(null);

        btnTabelaProduto.setToolTipText("Tabela de Produtos");
        btnTabelaProduto.setBorder(null);
        btnTabelaProduto.setContentAreaFilled(false);
        btnTabelaProduto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnTabelaProdutoMouseMoved(evt);
            }
        });
        btnTabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTabelaProdutoMouseExited(evt);
            }
        });
        btnTabelaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaProdutoActionPerformed(evt);
            }
        });
        pnlTabelaProduto.add(btnTabelaProduto);
        btnTabelaProduto.setBounds(10, 10, 80, 80);

        pnlFundoBranco.add(pnlTabelaProduto);
        pnlTabelaProduto.setBounds(290, 70, 100, 100);

        getContentPane().add(pnlFundoBranco);
        pnlFundoBranco.setBounds(260, 50, 480, 400);

        pnlFundoMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlFundoMenu.setLayout(null);

        pnlNovoCliente.setBackground(new java.awt.Color(102, 102, 102));
        pnlNovoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlNovoCliente.setLayout(null);

        btnNovoCliente.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.setContentAreaFilled(false);
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        pnlNovoCliente.add(btnNovoCliente);
        btnNovoCliente.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlNovoCliente);
        pnlNovoCliente.setBounds(0, 80, 260, 50);

        pnlFuncionario.setBackground(new java.awt.Color(153, 153, 153));
        pnlFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlFuncionario.setLayout(null);

        btnCancelar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Novo Funcionário");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlFuncionario.add(btnCancelar);
        btnCancelar.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlFuncionario);
        pnlFuncionario.setBounds(0, 130, 260, 50);

        pnlNovoProduto.setBackground(new java.awt.Color(204, 204, 204));
        pnlNovoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlNovoProduto.setLayout(null);

        btnSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Novo Produto");
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlNovoProduto.add(btnSalvar);
        btnSalvar.setBounds(0, 0, 260, 50);

        pnlFundoMenu.add(pnlNovoProduto);
        pnlNovoProduto.setBounds(0, 180, 260, 50);

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

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setToolTipText("Abrir Ferramentas");
        btnMenu.setBorder(null);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlFundoMenu.add(btnMenu);
        btnMenu.setBounds(30, 20, 30, 30);

        getContentPane().add(pnlFundoMenu);
        pnlFundoMenu.setBounds(0, 0, 260, 450);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setToolTipText("Minimizar");
        btnMinimizar.setBorder(null);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinimizar);
        btnMinimizar.setBounds(380, 10, 30, 30);

        btnFechar.setBackground(new java.awt.Color(0, 0, 0));
        btnFechar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setToolTipText("Fechar");
        btnFechar.setBorder(null);
        btnFechar.setContentAreaFilled(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel2.add(btnFechar);
        btnFechar.setBounds(430, 10, 30, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 0, 480, 50);

        setSize(new java.awt.Dimension(735, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        TelaCadastroCliente cliente = new TelaCadastroCliente();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TelaCadastroFuncionario funcionario = new TelaCadastroFuncionario();
        funcionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        TelaCadastroProdutos produtos = new TelaCadastroProdutos();
        produtos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        pnlNovoCliente.setVisible(true);
        pnlFuncionario.setVisible(true);
        pnlNovoProduto.setVisible(true);
        pnlSair.setVisible(true);
        
         try {
            sleep(5);
        } catch (InterruptedException ex) {
        }
            new Thread(){
                               
                @Override
                public void run(){
                                        
                    int xNovoFuncionario = pnlFuncionario.getLocation().x;
                    int yNovoFuncionario = 80;
                    
                    int xNovoProduto = pnlNovoProduto.getLocation().x;
                    int yNovoProduto = 80;
                    
                    int xSair = pnlSair.getLocation().x;
                    int ySair = 80;
                    
                    while(true){
                        yNovoFuncionario++;
                        yNovoProduto++;
                        ySair++;
                        
                        if(yNovoFuncionario >= 130){
                            yNovoFuncionario = 130;
                            
                        }
                        if(yNovoProduto >= 180){
                            yNovoProduto = 180;
                        }
                        if(ySair >= 230){
                            ySair = 230;
                        }
                        pnlFuncionario.setLocation(xNovoFuncionario,yNovoFuncionario);
                        pnlNovoProduto.setLocation(xNovoProduto,yNovoProduto);
                        pnlSair.setLocation(xSair, ySair);
                        
                        try {
                            sleep(5);
                        } catch (InterruptedException ex) {
                            
                        }
                    }
                }
            }.start();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnTabelaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaClientesActionPerformed
        
        
    }//GEN-LAST:event_btnTabelaClientesActionPerformed

    private void btnTabelaClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaClientesMouseMoved
        pnlTabelaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_btnTabelaClientesMouseMoved

    private void btnTabelaClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaClientesMouseExited
        pnlTabelaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnTabelaClientesMouseExited

    private void btnTabelaFuncionarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaFuncionarioMouseMoved
        pnlTabelaFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
    }//GEN-LAST:event_btnTabelaFuncionarioMouseMoved

    private void btnTabelaFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaFuncionarioMouseExited
        pnlTabelaFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_btnTabelaFuncionarioMouseExited

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(null, "Usuario deslogado");
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnTabelaProdutoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaProdutoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTabelaProdutoMouseMoved

    private void btnTabelaProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTabelaProdutoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTabelaProdutoMouseExited

    private void btnTabelaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaProdutoActionPerformed
        TelaTabelaProduto tela = new TelaTabelaProduto();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnTabelaProdutoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTabelaClientes;
    private javax.swing.JButton btnTabelaFuncionario;
    private javax.swing.JButton btnTabelaProduto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlFuncionario;
    private javax.swing.JPanel pnlFundoBranco;
    private javax.swing.JPanel pnlFundoMenu;
    private javax.swing.JPanel pnlNovoCliente;
    private javax.swing.JPanel pnlNovoProduto;
    private javax.swing.JPanel pnlSair;
    private javax.swing.JPanel pnlTabelaCliente;
    private javax.swing.JPanel pnlTabelaFuncionario;
    private javax.swing.JPanel pnlTabelaProduto;
    // End of variables declaration//GEN-END:variables
}
