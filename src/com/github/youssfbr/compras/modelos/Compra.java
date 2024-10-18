package com.github.youssfbr.compras.modelos;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao , double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String   toString() {
        return "Compra: descrição = " + descricao
                + " valor = " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(valor , Double.valueOf(outraCompra.valor));
    //    return Double.valueOf(valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
