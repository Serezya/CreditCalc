package org.example;

public class App {
    public static void main(String[] args) {
        CreditCalculator cc = new CreditCalculator(12, 100000, 10);

        double monthPayment = rounder(cc.getMonthPayment(cc.getSumCredit()));
        double overPayment = rounder(cc.getSumOverPayment(monthPayment));
        double fullSumInBank = rounder(cc.fullSumInBank(overPayment));

        System.out.println("Ежемесячный платеж: " + monthPayment + " у.е.");
        System.out.println("Переплата по кредиту: " + overPayment + " у.е.");
        System.out.println("Общая сумма к возврату в банк: " + fullSumInBank + " у.е.");
    }

    public static double rounder(double sum) {
        return Math.round(sum * 100) / 100.0;
    }
}