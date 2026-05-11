/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodeviaturas;

/**
 *
 * @author aluno
 */
public class UsuarioSistema {
    private int indentificador;
    private String login;
    private String senha;
    private String perfil;
    
    public int getIndentificador(){
        return indentificador;
    }
    
    public void setIndentificador(int _indentificador){
        indentificador = _indentificador;
    }
      public String getLogin(){
        return login;
    }
    
    public void setLogin(String _login){
        login = _login;
    }
      public String getSenha(){
        return senha;
    }
    
    public void setSenha(String _senha){
        senha = _senha;
    }
     public String getPerfil(){
        return perfil;
    }
    
    public void setPerfil(String _perfil){
        perfil = _perfil;
    }
}
