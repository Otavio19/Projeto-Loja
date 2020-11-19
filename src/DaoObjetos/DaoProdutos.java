/*
Nesse Pacote/Classe Colocaremos os métodos de "Deletar um Dado/Inserir um Dado/Atualizar um Dado" 
Méotods para a TABELA PRODUTO
*/
package DaoObjetos;

import Conexoes.Conexao;
import Objetos.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoProdutos {
    
    Conexao conex = new Conexao();   //Instanciamos a conexão do Banco de Dados
    Produto produto = new Produto(); //Instanciamos os atributos da Classe Produto do Pacote Objetos
    
    public void Salvar(Produto produto){
        
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produto(Nome,fornecedor,marca) values (?,?,?)");
            pst.setString(1,produto.getNome());
            pst.setString(2, produto.getFornecedor());
            pst.setString(3, produto.getMarca());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao inserir os Dados: \n"+ex);
        }
        
        conex.desconecta();
        
    }
    
}
