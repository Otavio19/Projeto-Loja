/*
Métodos Get/Set dos Atributos da Tela "PRODUTO" 
*/


package Objetos;

public class Produto {

    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTel1() {
        return Tel1;
    }

    public void setTel1(String Tel1) {
        this.Tel1 = Tel1;
    }

    public String getTel2() {
        return Tel2;
    }

    public void setTel2(String Tel2) {
        this.Tel2 = Tel2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    

    private String Nome;
    private String Tel1;
    private String Tel2;
    private String Email;
    private String Fornecedor;
    private String Marca;
    
}
