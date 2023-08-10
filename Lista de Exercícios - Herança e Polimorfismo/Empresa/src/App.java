import models.Funcionario;
import models.FuncionarioComEnsinoBasico;
import models.FuncionarioComEnsinoMedio;
import models.FuncionarioGraduado;
import models.Gerente;
import models.Supervisor;
import models.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Calculando sem comissão de cargo...");
        
        int numFuncionarios = 10;
        int numBasico = (int) (numFuncionarios * 0.4);
        int numMedio = (int) (numFuncionarios * 0.4);
        //int numSuperior = (int) (numFuncionarios * 0.2);

        Funcionario[] funcionarios = new Funcionario[numFuncionarios];

        for (int i = 0; i < numBasico; i++) {
            String nome = "FuncionarioBasico" + (i + 1);
            funcionarios[i] = new FuncionarioComEnsinoBasico(nome, i + 1, "Escola Básica" + (i + 1));
        }

        for (int i = numBasico; i < numBasico + numMedio; i++) {
            String nome = "FuncionarioMedio" + (i + 1);
            funcionarios[i] = new FuncionarioComEnsinoMedio(nome, i + 1, "Escola Básica" + (i + 1), "Escola Média" + (i + 1));
        }

        for (int i = numBasico + numMedio; i < numFuncionarios; i++) {
            String nome = "FuncionarioSuperior" + (i + 1);
            funcionarios[i] = new FuncionarioGraduado(nome, i + 1, "Escola Básica" + (i + 1), "Escola Média" + (i + 1), "Universidade" + (i + 1));
        }

        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioGraduado) {
                FuncionarioGraduado funcionarioGraduado = (FuncionarioGraduado) funcionario;
                double rendaTotal = funcionarioGraduado.calcularRendaTotal();
                custoSuperior += rendaTotal;
                custoTotal += rendaTotal;
            }else if (funcionario instanceof FuncionarioComEnsinoMedio) {
                FuncionarioComEnsinoMedio funcionarioMedio = (FuncionarioComEnsinoMedio) funcionario;
                double rendaTotal = funcionarioMedio.calcularRendaTotal();
                custoMedio += rendaTotal;
                custoTotal += rendaTotal;
            } else if (funcionario instanceof FuncionarioComEnsinoBasico) {
                FuncionarioComEnsinoBasico funcionarioBasico = (FuncionarioComEnsinoBasico) funcionario;
                double rendaTotal = funcionarioBasico.calcularRendaTotal();
                custoBasico += rendaTotal;
                custoTotal += rendaTotal;
            } else {
                double rendaTotal = funcionario.calcularRendaTotal();
                custoTotal += rendaTotal;
            }
        }

        System.out.println("Custo Total: R$" + custoTotal);
        System.out.println("Custo em Funcionários com Ensino Básico: R$" + custoBasico);
        System.out.println("Custo em Funcionários com Ensino Médio: R$" + custoMedio);
        System.out.println("Custo em Funcionários com Nível Superior: R$" + custoSuperior);

        System.out.println();

        //Recalculando com as comissões
        System.out.println("Calculando com comissão de cargo...");
        int numGerente = (int) (numFuncionarios * 0.1);
        int numSupervisor = (int) (numFuncionarios * 0.2);
        //int numVendedor = (int) (numFuncionarios * 0.7);

        for (int i = 0; i < numGerente; i++) {
            funcionarios[i].atribuirCargo(new Gerente());
        }

        for (int i = numGerente; i < numGerente + numSupervisor; i++) {
            funcionarios[i].atribuirCargo(new Supervisor());    
        }

        for (int i = numGerente + numSupervisor; i < numFuncionarios; i++) {
            funcionarios[i].atribuirCargo(new Vendedor());    
        }

        custoTotal = 0.0;
        custoBasico = 0.0;
        custoMedio = 0.0;
        custoSuperior = 0.0;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioGraduado) {
                FuncionarioGraduado funcionarioGraduado = (FuncionarioGraduado) funcionario;
                double rendaTotal = funcionarioGraduado.calcularRendaTotal();
                custoSuperior += rendaTotal;
                custoTotal += rendaTotal;
            }else if (funcionario instanceof FuncionarioComEnsinoMedio) {
                FuncionarioComEnsinoMedio funcionarioMedio = (FuncionarioComEnsinoMedio) funcionario;
                double rendaTotal = funcionarioMedio.calcularRendaTotal();
                custoMedio += rendaTotal;
                custoTotal += rendaTotal;
            } else if (funcionario instanceof FuncionarioComEnsinoBasico) {
                FuncionarioComEnsinoBasico funcionarioBasico = (FuncionarioComEnsinoBasico) funcionario;
                double rendaTotal = funcionarioBasico.calcularRendaTotal();
                custoBasico += rendaTotal;
                custoTotal += rendaTotal;
            } else {
                double rendaTotal = funcionario.calcularRendaTotal();
                custoTotal += rendaTotal;
            }
        }

        System.out.println("Custo Total: R$" + custoTotal);
        System.out.println("Custo em Funcionários com Ensino Básico: R$" + custoBasico);
        System.out.println("Custo em Funcionários com Ensino Médio: R$" + custoMedio);
        System.out.println("Custo em Funcionários com Nível Superior: R$" + custoSuperior);

        System.out.println();

        //Printa os funcionários
        System.out.println("REGISTRO DE FUNCIONÁRIOS");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
            System.out.println();
        }
    }
}
