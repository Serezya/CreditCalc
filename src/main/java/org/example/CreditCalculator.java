package org.example;

public class CreditCalculator {
    private final double countMonth;
    private final double sumCredit;
    private final double rate;

    public CreditCalculator(int countMonth, int sumCredit, double rate) {
        this.countMonth = countMonth;
        this.sumCredit = sumCredit;
        this.rate = rate / 100;
    }

    public double getMonthPayment(double sumCredit) {
        return 0;
    }

    public double getSumOverPayment(double monthPayment) {
        return 0;
    }

    public double fullSumInBank(double percents) {
        return 0;
    }

    public double getSumCredit() {
        return sumCredit;
    }

    public double getRate() {
        return rate;
    }
}
