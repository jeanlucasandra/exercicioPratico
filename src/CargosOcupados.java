public abstract class CargosOcupados extends Pessoa {
    private double salario;

    //construtores
    public CargosOcupados(double salario) {
        this.salario = salario;
    }

    public CargosOcupados() {
    }

    //get e set da variavel salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //classe abstrata para criar um contrato de herança e calcular salario
    abstract double calcularSalario();

    //metodo que mostra as informações
    void infosFuncionarios() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + Cargo());
        System.out.println("Salario: " + getSalario());
        System.out.println("Salario atual: " + calcularSalario());
        System.out.println("---------------------");
    }

    //classe abstrata para criar um contrato de herança e identificar o cargo
    abstract String Cargo();

}
