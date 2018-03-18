package br.com.projuris;

import java.math.BigDecimal;

/**
 *
 * @author Paulo
 */
public class CustoDepartamento {

    private String departamento;

    private BigDecimal custo;

    public CustoDepartamento(String departamento, BigDecimal custo) {
        this.departamento = departamento;
        this.custo = custo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public BigDecimal getCusto() {
        return custo;
    }

}
