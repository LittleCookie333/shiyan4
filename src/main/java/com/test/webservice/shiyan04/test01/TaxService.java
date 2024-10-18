package com.test.webservice.shiyan04.test01;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double calculateTax(double income) {
        if (income <= 5000) {
            return 0; // 不需要缴税
        } else {
            double taxableIncome = income - 5000; // 应纳税所得额
            double tax = 0;

            if (taxableIncome <= 3000) {
                tax = taxableIncome * 0.03;
            } else if (taxableIncome <= 12000) {
                tax = taxableIncome * 0.1 - 210;
            } else if (taxableIncome <= 25000) {
                tax = taxableIncome * 0.2 - 1410;
            } else if (taxableIncome <= 35000) {
                tax = taxableIncome * 0.25 - 2660;
            } else if (taxableIncome <= 55000) {
                tax = taxableIncome * 0.3 - 4410;
            } else if (taxableIncome <= 80000) {
                tax = taxableIncome * 0.35 - 7160;
            } else {
                tax = taxableIncome * 0.45 - 15160;
            }

            return Math.max(tax, 0); // 确保税额不为负
        }
    }
}