/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestaodeviaturas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Bombeiros {
    private String nome;
    private String indentidade;
    private String nomeGuerra;
    private String patente;
    private int matricula;
    private int contato;
    
    private Set<Equipe> compor = new HashSet<Equipe>();
    
     public Bombeiros(){
        nome = "nobody";    
    }
    
     public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
     public String getIndentidade(){
        return indentidade;
    }
    
    public void setIndentidade(String _indentidade){
        indentidade = _indentidade;
    }
    
      public String getNomeGuerra(){
        return nomeGuerra;
    }
    
    public void setNomeGuerra(String _nomeGuerra){
        nomeGuerra = _nomeGuerra;
    }
    
      public String getPatente(){
        return patente;
    }
    
    public void setPatente(String _patente){
        patente = _patente;
    }
    
     public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int _matricula){
        matricula = _matricula;
    }
    
     public int getContato(){
        return contato;
    }
    
    public void setContato(int _contato){
        contato = _contato;
    }
    public void compor (Equipe equipe){
        compor.add(equipe);
    }
}
