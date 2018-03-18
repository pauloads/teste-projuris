package br.com.projuris;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0)),
                new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70)),
                new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45)),
                new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9)),
                new Funcionario("Gerente", "Financeiro", new BigDecimal(7500)),
                new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0)),
                new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4)),
                new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90)),
                new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50)),
                new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0))
        );

        Calculo calculadoraDeCusto = new MyCalculo();

        calculadoraDeCusto.custoPorCargo(funcionarios)
                .stream().forEach(x -> {
                    System.out.println(x.getCargo() + " -> " + x.getCusto().setScale(2, RoundingMode.HALF_EVEN));
                });

        calculadoraDeCusto.custoPorDepartamento(funcionarios)
                .stream().forEach(x -> {
                    System.out.println(x.getDepartamento() + " -> " + x.getCusto().setScale(2, RoundingMode.HALF_EVEN));
                });
    }
}
