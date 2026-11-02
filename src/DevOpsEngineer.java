public class DevOpsEngineer extends CargosOcupados {

    //sobreescrita da classe abstrata fazendo o calculo de bonus do salário
    @Override
    double calcularSalario() {
        return getSalario() * 1.10;
    }

    //sobreescrita da classe abstrata mostrando o cargo ocupado
    @Override
    String Cargo() {
        return "DevOps Engineer";
    }
}
