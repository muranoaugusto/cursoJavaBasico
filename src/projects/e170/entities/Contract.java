package projects.e170.entities;

import java.util.Date;

public  class   Contract{
        private Integer numero,
                        numeroDeParcelas;
        private Date    data;
        private Double  valor;


    public Contract() {
    }

    public Contract (Integer numero, Date data, Double valor, Integer numeroParcelas) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.numeroDeParcelas = numeroParcelas;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroDeParcelas() {
        return this.numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }



}