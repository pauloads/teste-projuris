package br.com.projuris;

import java.math.BigDecimal;

/**
 *
 * @author Paulo
 */
public class Funcionario {
    
    private String cargo;
    
    private String departamento;
    
    private BigDecimal salario; 

    public Funcionario(String cargo, String departamento, BigDecimal salario) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    
    
}
