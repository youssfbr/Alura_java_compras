package com.github.youssfbr.compras.aplicacao;

import com.github.youssfbr.compras.modelos.CartaoDeCredito;
import com.github.youssfbr.compras.modelos.Compra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o limite do cartão: ");
        double limite = sc.nextDouble();
        final CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {

            System.out.print("\nDigite a descrição da compra: ");
            final String descricao = sc.next();

            System.out.print("Digite o valor da compra: ");
            final double valor = sc.nextDouble();

            final Compra compra = new Compra(descricao , valor);
            final boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("\nCompra realizada!");
                System.out.println("\nContinuar comprando?");
                System.out.print("Digite 0 para sair ou 1 para continuar na aplicação: ");
                sair = sc.nextInt();
            } else {
                System.out.println("\nSaldo insuficiente!");
                sair = 0;
            }
        }

        sc.close();

        System.out.println("\n*************************************");
        System.out.println("\nCOMPRAS REALIZADAS:\n");

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n*************************************");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
    }
}
