/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author guilhermetravaglialargura
 */
public class Professor extends Pessoa {
    private String dataAdmissao;
    private double salarioBruto;
    private double inss;
    private double irpf;
    private double salarioLiquido;
    
    public Professor(){
        super();
        this.dataAdmissao = "";
        this.salarioBruto = 0.0;
    }
    
    public void setDataAdmissao(String x){
        this.dataAdmissao = x;
    }
    
    public void setSalarioBruto(double x){
        this.salarioBruto = x;
    }
    
    public String getDataAdmissao(){
        return this.dataAdmissao;
    }
    
    public double getSalarioBruto(){
        return this.salarioBruto;
    }
    
    public void calcularLiquido(){
        this.inss = (this.salarioBruto * 0.14);
        if (this.salarioBruto >= 5000){
            this.irpf = (this.salarioBruto * 0.225);
        } else {
            this.irpf = 0;
        }
        this.salarioLiquido = this.salarioBruto - (this.inss + this.irpf);
    }
    
    public double getSalarioLiquido(){
        return this.salarioLiquido;
    }
    
    public double getINSS(){
        return this.inss;
    }
    
    public double getIRPF(){
        return this.irpf;
    }
}
