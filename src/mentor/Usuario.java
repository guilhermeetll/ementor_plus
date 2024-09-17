/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author guilhermetravaglialargura
 */
public class Usuario {
    
    private String login;
    private String senha;
    private String nomeCompleto;
    private String email;
    private int nivelAcesso;
    private ConexoesMySQL SQL = new ConexoesMySQL();
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = "";
        this.email = "";
        this.nivelAcesso = 1;
    }
    
    public void setNomeCompleto(String x){
        this.nomeCompleto = x;
    }
    
    public void setEmail(String x){
        this.email = x;
    }
    
    public void setNivelAcesso(int x){
        this.nivelAcesso = x;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getSenha(){
        return this.senha;
    }
}
