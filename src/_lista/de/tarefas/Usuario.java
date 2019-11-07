package _lista.de.tarefas;

import java.util.ArrayList;

public class Usuario {
    private String email;
    private String senha;
    private ArrayList<Usuario> usuarios;
    
    //Email e senha
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    //ArrayList
    public void setUsuario(ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    
    public ArrayList getUsuario(){
        return usuarios;
    }
    
    
}
