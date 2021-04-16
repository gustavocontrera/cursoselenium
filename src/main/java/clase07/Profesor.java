package clase07;

public class Profesor extends Persona {

    private int salario;

    public Profesor(String unNombre, int unDni, int unSalario) {
        super(unNombre, unDni);
        this.salario = unSalario;
    }

    public void setSalario(int unSalario) {
        this.salario = unSalario;
    }

    public int getSalario() {
        return this.salario;
    }

    public String toString() {
        return super.toString() + ". Su salario es " + this.salario;
    }
}
