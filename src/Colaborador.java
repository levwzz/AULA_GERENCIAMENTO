import static java.lang.IO.println;

public class Colaborador {
    private String nome;
    private String cpf;
    private String matricula;
    private double salarioBase;

    public Colaborador(String nome, String cpf, String matricula, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    // Método abstrato polimórfico
    public double calcularRemuneracao() {
        return 0;
    }

    public void exibirInformacoes() {
        println("Nome: " + nome + " | CPF: " + cpf + " | Matrícula: " + matricula +
                " | Remuneração: R$ " + String.format("%.2f", calcularRemuneracao()));
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getMatricula() { return matricula; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}
