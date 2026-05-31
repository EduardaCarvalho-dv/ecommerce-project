package com.lp1.project.domain.payment;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;


public class BankSlipPayment extends PaymentMethod {
    private String barcode;
    private LocalDate dueDate;

    public BankSlipPayment() {
        generateBarcode();
        dueDate = LocalDate.now().plusDays(3);
    }

    @Override
    public boolean processPayment(BigDecimal value) {
        System.out.println("Pagamento no boleto de R$" + value);
        return true;
    }

    private void generateBarcode(){
        this.barcode = String.valueOf(new Random().nextLong(999999999)
                + new Random().nextLong(999999999));
        //gambiarra ^^^^
    }

    public String getBarcode() {
        return barcode;
    }
}
