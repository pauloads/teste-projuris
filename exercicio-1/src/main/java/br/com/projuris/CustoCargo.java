package br.com.projuris;

import java.math.BigDecimal;

/**
 *
 * @author Paulo
 */
public class CustoCargo {

    private String cargo;

    private BigDecimal custo;

    public CustoCargo(String cargo, BigDecimal custo) {
        this.cargo = cargo;
        this.custo = custo;
    }

    public String getCargo() {
        return cargo;
    }
    public BigDecimal getCusto() {
        return custo;
    }

}
