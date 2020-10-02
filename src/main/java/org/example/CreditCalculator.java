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
        double x = Math.pow((1 + rate / countMonth), countMonth);
        double K = (rate / countMonth * x) / (x - 1);
        return sumCredit * K;
    }

    public double getSumOverPayment(double monthPayment) {
        double percents = sumCredit / countMonth * this.rate;
        double sumPayment = sumCredit - monthPayment + percents;

        for (int i = 0; i < countMonth - 1; i++) {
            double payPercents = sumPayment / countMonth * rate;
            double planPay = monthPayment - payPercents;
            percents += payPercents;
            sumPayment = sumPayment - planPay;
        }
        return percents;
    }

    public double fullSumInBank(double percents) {
        return sumCredit + percents;
    }

    public double getSumCredit() {
        return sumCredit;
    }

    public double getRate() {
        return rate;
    }
}