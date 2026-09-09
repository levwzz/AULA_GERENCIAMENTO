// Aprendiz: remuneração proporcional às horas
public class Aprendiz extends Colaborador {
    private int horasTrabalhadas;
    private double valorHora;

    public Aprendiz(String nome, String cpf, String matricula, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, matricula, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularRemuneracao() {
        return horasTrabalhadas * valorHora;
    }
}