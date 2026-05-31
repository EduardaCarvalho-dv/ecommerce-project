package com.lp1.project.domain.payment;

import java.math.BigDecimal;
import java.util.Random;

public class PixPayment extends PaymentMethod {
    public String pixKey;

    public PixPayment(){
        generatePixKey();
    }

    @Override
    public boolean processPayment(BigDecimal value) {
        System.out.println("Pagamento no PIX de R$" + value);
        return true;
    }

    private void generatePixKey(){
        this.pixKey = String.valueOf(new Random().nextLong(999999999)
        + new Random().nextLong(999999999));
        //gambiarra ^^^^
    }

    public String getPixKey() {
        return pixKey;
    }

}
