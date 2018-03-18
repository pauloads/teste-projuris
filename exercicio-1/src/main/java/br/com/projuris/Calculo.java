package br.com.projuris;

import java.util.List;

/**
 *
 * @author Paulo
 */
public interface Calculo {

    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);

    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);

}
