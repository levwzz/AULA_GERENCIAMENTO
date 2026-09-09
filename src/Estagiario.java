// Estagiário: bolsa-auxílio e acesso ao sistema
public class Estagiario extends Colaborador implements Acessivel {

    public Estagiario(String nome, String cpf, String matricula, double bolsaAuxilio) {
        super(nome, cpf, matricula, bolsaAuxilio);
    }

    @Override
    public double calcularRemuneracao() {
        return getSalarioBase();
    }

    @Override
    public void acessarSistemaInterno() {
        System.out.println(getNome() + " [Estagiário] acessou o sistema (perfil restrito).");
    }
}