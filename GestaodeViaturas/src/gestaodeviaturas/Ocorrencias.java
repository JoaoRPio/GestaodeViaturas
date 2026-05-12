/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodeviaturas;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Ocorrencias {
   private int indentificador;
   private String tipo;
    private Date data;
    private String hora;
    private String local;
    private String decricao;
    private String status;
    private String sinistro;
    private String prioridade;
    
    private Set<Viaturas> participar = new HashSet<Viaturas>();
    
    public int getIndentificador(){
        return indentificador;
    }
    
    public void setIndentificador(int _indentificador){
        indentificador = _indentificador;
    }
    
      public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String _tipo){
        tipo = _tipo;
    }
      public Date getData(){
        return data;
    }
    
    public void setData(Date _data){
        data = _data;
    }
      public String getHora(){
        return hora;
    }
    
    public void setHora(String _hora){
        hora = _hora;
    }
     public String getLocal(){
        return local;
    }
    
    public void setLocal(String _local){
        local = _local;
    }
     public String getDecricao(){
        return decricao;
    }
    
    public void setDecricao(String _decricao){
        decricao = _decricao;
    }
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String _status){
        status = _status;
    }
    public String getSinistro(){
        return sinistro;
    }
    
    public void setSinistro(String _sinistro){
        sinistro = _sinistro;
    }
    public String getPrioridade(){
        return prioridade;
    }
    
    public void setPrioridade(String _prioridade){
        prioridade = _prioridade;
    }
    public void participar (Viaturas viaturas){
        participar.add(viaturas);
    }
}
