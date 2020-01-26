package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String Registro;
    private String nivelCargo;
    private String experiencia;
    private String login;
    private String senha;
  


    public Secretario() {
    }

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }




    

    public String getLogin() {
        return login;
    }

   
    public void setLogin(String login) {
        this.login = login;
    }

   
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getRegistro() {
        return this.Registro;
    }

    public void setRegistro( String Registro) {
        this.Registro = Registro;
    }

    public String getNivelCargo() {
        return this.nivelCargo;
    }

    public void setNivelCargo( String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia( String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double salario() {
       
        return 2500;
    }

   

    @Override
    public boolean autenticar(String login, String senha) {
        this.login=login;
        this.senha=senha;
        return autenticar();
    }
    


    @Override
    public boolean autenticar() {
       
        return login.equals("admin") && senha.equals("admin");
    }

}