
package Conexoes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {

    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private String endereço_banco = "jdbc:mysql://localhost:3306/projetoloja";
    private String usuario = "admin";
    private String senha = "admin";
    
    public void conectar(){
              
         try {

            con = DriverManager.getConnection(endereço_banco, usuario, senha);
            //conn = DriverManager.getConnection("jdbc:mysql://localhost3306/banco_loja", "root", "root");
            
            if(con != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + con);
                
            }            
            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
       
    }
    
    public void executaSql(String sql){
        
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao executar o SQL: \n "+ ex.getMessage());
           
        }
               
    }
    
    public void desconecta(){
        try {
            con.close();
            System.out.println("Bd Desconectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: \n" + ex.getMessage());
        }        
    }
    
    
    
}
