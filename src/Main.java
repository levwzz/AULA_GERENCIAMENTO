import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        colaboradores.add(new FuncionarioCLT("Ana Silva", "111.222.333-44", "CLT001", 5000.00, 800.00));
        colaboradores.add(new FuncionarioPJ("Carlos Lima", "555.666.777-88", "PJ001", 9500.00));
        colaboradores.add(new Estagiario("Beatriz Costa", "999.888.777-66", "EST001", 1500.00));
        colaboradores.add(new Aprendiz("Lucas Rocha", "123.456.789-00", "APR001", 80, 15.00));

        // Objeto do Desafio Extra
        colaboradores.add(new Consultor("Roberto Alves", "444.333.222-11", "CNS001", 40, 150.00));

        System.out.println("=== RELATÓRIO DE COLABORADORES ===");
        for (Colaborador c : colaboradores) {
            c.exibirInformacoes();

            // Verificação polimórfica de capacidades via interfaces
            if (c instanceof Acessivel) {
                ((Acessivel) c).acessarSistemaInterno();
            }
            if (c instanceof TrabalhadorRemoto) {
                ((TrabalhadorRemoto) c).trabalharRemotamente();
            }
            System.out.println("----------------------------------------");}
    }   }
