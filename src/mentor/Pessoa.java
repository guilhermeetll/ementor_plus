/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author guilhermetravaglialargura
 */
public class Pessoa {
    protected String Nome;
    protected long CPF;
    protected String DataNascimento;
    protected String Telefone;
    protected String Rua;
    protected String Bairro;
    protected String Cidade;
    protected String Estado;
    
    public Pessoa(){
        this.Nome = "";
        this.CPF = 0;
        this.DataNascimento = "";
        this.Telefone = "";
        this.Rua = "";
        this.Bairro = "";
        this.Cidade = "";
        this.Estado = "";
    }
    
    public void setNome(String x){
        this.Nome = x;
    }
    
    public void setCpf(long x){
        this.CPF = x;
    }
    
    public void setDataNascimento(String x){
        this.DataNascimento = x;
    }
    
    public void setTelefone(String x){
        this.Telefone = x;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public long getCpf(){
        return this.CPF;
    }
    
    public String getDataNascimento(){
        return this.DataNascimento;
    }
    
    public String getTelefone(){
        return this.Telefone;
    }
    
    public void setRua(String x){
        this.Rua = x;
    }
    
    public String getRua(){
        return this.Rua;
    }

    public void setBairro(String x){
        this.Bairro = x;
    }
    
    public String getBairro(){
        return this.Bairro;
    }
    
    public void setCidade(String x){
        this.Cidade = x;
    }
    
    public String getCidade(){
        return this.Cidade;
    }

    public void setEstado(String x){
        this.Estado = x;
    }
    
    public String getEstado(){
        return this.Estado;
    }
}
