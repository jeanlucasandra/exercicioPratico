import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //classes e set's dos funcionarios.
        CargosOcupados f1 = new Desenvolvedor();
        f1.setNome("João");
        f1.setSalario(8000);
        
        CargosOcupados f2 = new ProductManager();
        f2.setNome("Maria");
        f2.setSalario(12000);

        CargosOcupados f3 = new DevOpsEngineer();
        f3.setNome("Pedro");
        f3.setSalario(9000);

        //lista para percorrer os funcionarios.
        List<CargosOcupados> listaCargosOcupados = new ArrayList<>();
        listaCargosOcupados.add(f1);
        listaCargosOcupados.add(f2);
        listaCargosOcupados.add(f3);

        //percorre todos os funcionários, diz o total de funcionários, e soma a folha de pagamento.
        double totalFolhaDePagamento = 0;
        for (CargosOcupados cargosocupados : listaCargosOcupados) {
            cargosocupados.infosFuncionarios();
            totalFolhaDePagamento = totalFolhaDePagamento + cargosocupados.getSalario();
        }

        System.out.println();

        System.out.println("Quantidade de Funcionários: " + listaCargosOcupados.size());
        System.out.println("Total da folha de pagamento: " + totalFolhaDePagamento);


    }
}