package isp;

import java.util.Collections;
import java.util.List;

public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {

    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return Collections.emptyList();
    }

//    @Override
//    public void intiateLoanSettlement() {
//        throw new UnsupportedOperationException("This is not a loan payment");
//    }
//
//    @Override
//    public void initiateRePayment() {
//        throw new UnsupportedOperationException("This is not a loan payment");
//    }
}
