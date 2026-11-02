# Exercício prático: cargos e salários em Java

Aplicação de console que demonstra uma estrutura simples de funcionários por cargo. O programa cria exemplos de Desenvolvedor, Product Manager e DevOps Engineer, calcula o salário com o bônus de cada função e exibe os dados e a quantidade de funcionários.

Este projeto foi desenvolvido como exercício de estudo da plataforma Rocketseat.

## Conceitos de Java utilizados

- **Orientação a objetos e herança:** `Pessoa` guarda o nome; `CargosOcupados` herda de `Pessoa`; os cargos concretos herdam de `CargosOcupados`.
- **Abstração:** `CargosOcupados` é abstrata e define os métodos `calcularSalario()` e `Cargo()` para cada cargo implementar.
- **Polimorfismo:** a lista guarda referências do tipo `CargosOcupados` e executa a implementação correspondente a cada funcionário.
- **Encapsulamento:** os atributos `nome` e `salario` são privados e acessados por getters e setters.
- **Coleções e laços:** `List`/`ArrayList` armazenam os funcionários e um `for` percorre a lista.
- **Sobrescrita:** `@Override` especializa os cálculos de bônus: 15% para Desenvolvedor, 20% para Product Manager e 10% para DevOps Engineer.

## Requisitos

- JDK instalado (inclui `java` e `javac`).
- Uma IDE Java, como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java (opcional para executar pelo terminal).

## Executar em uma IDE

1. Abra a pasta `exercicioPratico` na sua IDE ou crie um projeto Java apontando para essa pasta.
2. Marque `src` como pasta de fontes, se a IDE não fizer isso automaticamente.
3. Abra `src/Main.java` e execute o método `main`.

O projeto usa o pacote padrão, sem dependências externas ou ferramenta de build.

## Executar no CMD (Windows)

No CMD, entre na pasta do projeto e compile os arquivos:

```bat
cd /d C:\caminho\para\exercicioPratico
mkdir out
javac -d out src\Pessoa.java src\CargosOcupados.java src\Desenvolvedor.java src\ProductManager.java src\DevOpsEngineer.java src\Main.java
java -cp out Main
```

Se a pasta `out` já existir, o CMD pode informar que ela já existe; nesse caso, siga com a compilação. Confirme que `java -version` e `javac -version` funcionam caso o CMD não reconheça esses comandos.

## Observação sobre a folha exibida

O salário atual de cada funcionário é calculado com o bônus. A linha `Total da folha de pagamento`, no código atual, soma os salários base (`getSalario()`), sem incluir esses bônus.
