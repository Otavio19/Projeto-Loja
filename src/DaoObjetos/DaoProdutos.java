/*
Nesse Pacote/Classe Colocaremos os métodos de "Deletar um Dado/Inserir um Dado/Atualizar um Dado" 
Méotods para a TABELA PRODUTO
*/
package DaoObjetos;

import Conexoes.Conexao;
import BeansObjetos.BeansProduto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoProdutos {
    
    Conexao conex = new Conexao();   //Instanciamos a conexão do Banco de Dados
    BeansProduto produto = new BeansProduto(); //Instanciamos os atributos da Classe Produto do Pacote Objetos
    
    public void SalvarProdutos(BeansProduto produto){
        
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
    
    public BeansProduto buscaProduto(BeansProduto prod){
        conex.conectar();
        conex.executaSql("select * from produto where id like '%" + prod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            prod.setCodigo(conex.rs.getInt("id"));
            prod.setNome(conex.rs.getString("Nome"));
            prod.setFornecedor(conex.rs.getString("fornecedor"));
            prod.setMarca(conex.rs.getString("marca"));             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: \n"+ex);
        }
        conex.desconecta();
        return prod;
    }
    
}
