/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodeviaturas;

import java.util.Date;


public class Viaturas {
   private int indentificador;
   private String tipo;
   private String prefixo;
   private String placa;
   private String modelo;
   private Date anoDefabricacao;
   private String status;
   private int quilometragemAtual;
   private String localizacaoAtual;
   
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
    
      public String getPrefixo(){
        return prefixo;
    }
    
    public void setPrefixo(String _prefixo){
        prefixo = _prefixo;
    }
    
     public String getPlaca(){
        return prefixo;
    }
    
    public void setPlaca(String _placa){
        placa = _placa;
    }
}
