
package DaoObjetos;

import Conexoes.Conexao;
import BeansObjetos.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoCliente {
    
    Conexao conex = new Conexao();
    Cliente cliente = new Cliente();
    
    public void SalvarCliente(Cliente cliente){
         
        conex.conectar();
        try {
            
            PreparedStatement pst = conex.con.prepareStatement(
                    "insert into cliente(Cpf_Cliente,Nome_Cliente,Endereço_Cliente,Cidade_Cliente,Tel1_Cliente,Tel2_Cliente,Email_Cliente,Sexo_Cliente,Estado_Cliente) "
                            + "values (?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1,cliente.getCpf());
            pst.setString(2,cliente.getNome());
            pst.setString(3,cliente.getEndereço());
            pst.setString(4,cliente.getCidade());           
            pst.setString(5,cliente.getTel1());
            pst.setString(6,cliente.getTel2());
            pst.setString(7,cliente.getEmail());
            pst.setString(8,cliente.getSexo());
            pst.setString(9,cliente.getEstado());      
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Inserir os dados: " + ex);
            
        }
        conex.desconecta();
        
    }
}
