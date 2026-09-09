// Funcionário PJ: remuneração via contrato e trabalho remoto
public class FuncionarioPJ extends Colaborador implements TrabalhadorRemoto {

    public FuncionarioPJ(String nome, String cpf, String matricula, double valorContrato) {
        super(nome, cpf, matricula, valorContrato);
    }

    @Override
    public double calcularRemuneracao() {
        return getSalarioBase(); // Valor acordado em contrato
    }

    @Override
    public void trabalharRemotamente() {
        IO.println(getNome() + " [PJ] está prestando serviço remotamente.");
    }
}