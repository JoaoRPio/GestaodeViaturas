/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodeviaturas;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


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
   
   private Set<Manutencoes> possui = new HashSet<Manutencoes>();
   private Set<UsuarioSistema> realiza = new HashSet<UsuarioSistema>();
   
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
        return placa;
    }
    
    public void setPlaca(String _placa){
        placa = _placa;
    }
     public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String _modelo){
        modelo = _modelo;
    }
     public Date getAnoDefabricacao(){
        return anoDefabricacao;
    }
    
    public void setAnoDefabricacao(Date _anoDefabricacao){
        anoDefabricacao = _anoDefabricacao;
    }
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String _status){
        status = _status;
    }
    public int getQuilometragemAtual(){
        return quilometragemAtual;
    }
    
    public void setQuilometragemAtual(int _quilometragemAtual){
        quilometragemAtual = _quilometragemAtual;
    }
      public String getLocalizacaoAtual(){
        return localizacaoAtual;
    }
    
    public void setLocalizacaoAtual(String _localizacaoAtual){
        localizacaoAtual = _localizacaoAtual;
    }
    public void possui (Manutencoes manutencoes){
        possui.add(manutencoes);
    }
    public void realiza (UsuarioSistema usuarioSistema){
        realiza.add(usuarioSistema);
    }
}
