package com.github.youssfbr.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        saldo = limite;
        compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        
        if (saldo > compra.getValor()) {
            saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
