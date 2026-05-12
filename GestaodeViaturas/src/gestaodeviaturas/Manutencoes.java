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
public class Manutencoes {
    private int indentificadorManutencao;
    private Boolean tipo;
    private String decricao;
    private Date dataInicio;
    private Date dataFinal;
    private String horaInicio;
    private String horaFim;
    private int custo;
    private int viatura;
    
    private Set<Viaturas> fazer = new HashSet<Viaturas>();
    private Set<Equipe> operar = new HashSet<Equipe>();
    
     public int getIndentificadorManutencao(){
        return indentificadorManutencao;
    }
    
    public void setIndentificadorManutencao(int _indentificadorManutencao){
       indentificadorManutencao = _indentificadorManutencao;
    }
    
     public Boolean getTipo(){
        return tipo;
    }
    
    public void setTipo(boolean _tipo){
        tipo = _tipo;
    }
    
    public String getDecricao(){
        return decricao;
    }
    
    public void setDecricao(String _decricao){
        decricao = _decricao;
    }
    
        public Date getDataInicio(){
        return dataInicio;
    }
    
    public void setDataInicio(Date _dataInicio){
        dataInicio = _dataInicio;
    }
    
        public Date getDataFinal(){
        return dataFinal;
    }
    
    public void setDataFinal(Date _dataFinal){
        dataFinal = _dataFinal;
    }
    
    public String getHoraInicio(){
        return horaInicio;
    }
    
    public void setHoraInicio(String _horaInicio){
        horaInicio = _horaInicio;
    }
    
     public String getHoraFim(){
        return horaFim;
    }
    
    public void setHoraFim(String _horaFim){
        horaFim = _horaFim;
    }
    
     public int getCusto(){
        return custo;
    }
    
    public void setCusto(int _custo){
       custo = _custo;
    }
    
     public int getViatura(){
        return viatura;
    }
    
    public void setViatura(int _viatura){
       viatura = _viatura;
    }
    public void fazer (Viaturas viaturas){
        fazer.add(viaturas);
    }
    public void operar (Equipe equipe){
        operar.add(equipe);
    }
}
