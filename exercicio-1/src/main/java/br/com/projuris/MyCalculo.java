package br.com.projuris;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Paulo
 */
public class MyCalculo implements Calculo {

    @Override
    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {

        return funcionarios.stream().collect(
                Collectors.groupingBy(
                        Funcionario::getCargo,
                        Collectors.mapping(Funcionario::getSalario, Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))
                ))
                .entrySet().stream()
                .map(c -> new CustoCargo(c.getKey(), c.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
        
        return funcionarios.stream().collect(
                Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.mapping(Funcionario::getSalario, Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))
                ))
                .entrySet().stream()
                .map(c -> new CustoDepartamento(c.getKey(), c.getValue()))
                .collect(Collectors.toList());
    }

}
