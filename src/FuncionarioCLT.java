// Funcionário CLT: possui benefícios, acesso ao sistema e trabalho remoto
public class FuncionarioCLT extends Colaborador implements Acessivel, TrabalhadorRemoto {
    private double valorBeneficios;

    public FuncionarioCLT(String nome, String cpf, String matricula, double salarioBase, double valorBeneficios) {
        super(nome, cpf, matricula, salarioBase);
        this.valorBeneficios = valorBeneficios;
    }

    @Override
    public double calcularRemuneracao() {
        return getSalarioBase() + valorBeneficios;
    }

    @Override
    public void acessarSistemaInterno() {
        IO.println(getNome() + " [CLT] acessou o sistema com credenciais internas.");
    }

    @Override
    public void trabalharRemotamente() {
        IO.println(getNome() + " [CLT] conectou via VPN para trabalho remoto.");
    }
}