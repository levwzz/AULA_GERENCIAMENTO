// Consultor: novo tipo adicionado sem alterar as classes existentes
public class Consultor extends Colaborador implements TrabalhadorRemoto {
    private int horasConsultoria;
    private double valorHora;

    public Consultor(String nome, String cpf, String matricula, int horasConsultoria, double valorHora) {
        super(nome, cpf, matricula, 0);
        this.horasConsultoria = horasConsultoria;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularRemuneracao() {
        return horasConsultoria * valorHora;
    }

    @Override
    public void trabalharRemotamente() {
        IO.println(getNome() + " [Consultor] realizando consultoria remota.");
    }
}