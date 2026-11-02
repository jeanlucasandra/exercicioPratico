public class Desenvolvedor extends CargosOcupados {

    //sobreescrita da classe abstrata fazendo o calculo de bonus do salário
    @Override
    double calcularSalario() {
        return getSalario() * 1.15;
    }

    //sobreescrita da classe abstrata mostrando o cargo ocupado
    @Override
    String Cargo() {
        return "Desenvolvedor";
    }
}
