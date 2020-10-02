package org.example;

import org.junit.jupiter.api.Assertions;


public class AppTest {
    CreditCalculator cc = new CreditCalculator(12, 100000, 10);

    @org.junit.jupiter.api.Test
    public void MonthPaymentLessSumCredit() {
        double monthPayment = cc.getMonthPayment(cc.getSumCredit()); // месячный платеж не больше суммы кредита
        boolean monthPaymentLessSum;
        monthPaymentLessSum = monthPayment < cc.getSumCredit();
        Assertions.assertTrue(monthPaymentLessSum);
    }

    @org.junit.jupiter.api.Test
    public void OverPaymentLessPercents() {
        double overPayment = cc.getSumOverPayment(cc.getMonthPayment(cc.getSumCredit())); // переплата не больше чем % ставка
        boolean overPaymentCredit;
        overPaymentCredit = overPayment < cc.getSumCredit()*cc.getRate();
        Assertions.assertTrue(overPaymentCredit);
    }

    @org.junit.jupiter.api.Test
    public void FullSumOverInitial() {
        double fullSumInBank = cc.fullSumInBank(cc.getSumOverPayment(cc.getMonthPayment(cc.getSumCredit()))); // сумма возврата > суммы кредита
        boolean overSum;
        overSum = fullSumInBank > cc.getSumCredit();
        Assertions.assertTrue(overSum);
    }
}
