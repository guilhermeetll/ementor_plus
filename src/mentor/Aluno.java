/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author guilhermetravaglialargura
 */
public class Aluno extends Pessoa {
    protected long Matricula;
    protected int Periodo;
    
    public Aluno(){
        super();
        this.Periodo = 0;
        this.Matricula = 0;
    }
    
    public void setPeriodo(int x){
        this.Periodo = x;
    }
    
    public void setMatricula(long x){
        this.Matricula = x;
    }
    
    public int getPeriodo(){
        return this.Periodo;
    }
    
    public long getMatricula(){
        return this.Matricula;
    }
}
