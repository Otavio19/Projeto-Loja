
package DaoObjetos;

import Conexoes.Conexao;
import BeansObjetos.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoFuncionario {
    
    Conexao conex = new Conexao();
    Funcionario funcionario = new Funcionario();
    
    public void SalvarFuncionario(Funcionario funcionario){
        conex.conectar();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareStatement("insert into funcionario"
                    + "(Cpf_Funcionario,Nome_Funcionario,Rua_Funcionario,"
                    + "Bairro_Funcionario,Numero_Funcionario,Cidade_Funcionario,"
                    + "Tel1_Funcionario,Tel2_Funcionario,Email_Funcionario,"
                    + "Sexo_Funcionario,Estado_Funcionario,Login_Funcionario,"
                    + "Senha_Funcionario,Salario_Funcionario)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
        pst.setString(1,funcionario.getCpf());    
        pst.setString(2,funcionario.getNome());
        pst.setString(3,funcionario.getRua());
        pst.setString(4,funcionario.getBairro());
        pst.setString(5,funcionario.getNumero());
        pst.setString(6,funcionario.getCidade());
        pst.setString(7,funcionario.getTel1());
        pst.setString(8,funcionario.getTel2());
        pst.setString(9,funcionario.getEmail());
        pst.setString(10,funcionario.getSexo());
        pst.setString(11,funcionario.getEstado());
        pst.setString(12,funcionario.getLogin());
        pst.setString(13,funcionario.getSenha());
        pst.setString(14,funcionario.getSalario());
        
        pst.execute();
        
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro Ao inserir os Dados: \n"+ex);
            
        }
        
        
        
    }
    
}
