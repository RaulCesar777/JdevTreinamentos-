package cursojava.classes;

public class Secretario extends Pessoa{

    private String Registro;
    private String nivelCargo;
    private String experiencia;


    public String getRegistro() {
        return this.Registro;
    }

    public void setRegistro(String Registro) {
        this.Registro = Registro;
    }

    public String getNivelCargo() {
        return this.nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double salario() {
       
        return 2500;
    }
    
}